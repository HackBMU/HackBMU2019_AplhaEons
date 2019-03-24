import pandas as pd
import numpy as np

course=pd.read_csv('data.csv')
course1=course.groupby(['Course'])['Rating'].count()
rating=course.groupby(['Course'])['Rating'].mean()


course=pd.merge(course1,rating,on='Course')

course2=pd.read_csv('data2.csv')
course=pd.merge(course,course2,on='Course')

out=course.to_json(orient='table')
with open('json.txt','w') as f:
	f.write(out)
course.to_csv("result.csv")
print(course)
