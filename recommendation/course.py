import pandas as pd
import numpy as np

course=pd.read_csv('data.csv')
course1=course.groupby(['Course'])['Rating'].count()
rating=course.groupby(['Course'])['Rating'].mean()


course=pd.merge(course1,rating,on='Course')
course.to_csv("result.csv")
print(course)
