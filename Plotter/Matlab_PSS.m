% Puts all of the graphs on one plot
hold on
figure(1)
x1 = -50:1:50;
y1 = sin(x1);

%Salted graph function
salted = y1 + ((rand(size(y1)) *5 )-1);
%Smooth function
smoothed = movmean(salted,30);
%Plots the 3 functions onto one graph
plot(x1,y1,"g",x1,salted,"r",x1,smoothed,"b")
title("Data Smoother and Salter for sin(x)")

