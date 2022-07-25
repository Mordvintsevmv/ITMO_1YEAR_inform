
from django.contrib import admin
from django.urls import path
import views

urlpatterns = [
    path('', views.index),
    path('hello/', views.indexRender),
    path('universityInfo/', views.universityInfo),
    path('disciplineInfo/', views.disciplineInfo),
    path('groupsInfo/', views.groupsInfo),
    path('departmentsInfo/', views.departmentsInfo),
    path('universityStructure/', views.universityStructure)
]