package com.Xworkz.collectionapp;

public class StateDTO {


		private String name;
		private String language;
		private int population;

		public String getName(){
		return name;
		}

		public void setName(String name){
		this.name=name;
		}

		public String getLanguage(){
		return language;
		}

		public void setLanguage(String language){
		this.language=language;
		}

		public int getPopulation(){
		return population;
		}

		public void setPopulation(int population){
		this.population= population;
		}

		@Override
		public String toString(){
			return "StateDTO - [name = "+this.name+" , language = "+this.language+" , population = "+this.population+"]";
		}

		}

