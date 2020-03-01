package com.vanaja.maven.customlist;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CustomList<T> 
{

	private int INITIAL_ARRAY_LENGTH = 3;
	T[] genericObject = (T[]) new Object[INITIAL_ARRAY_LENGTH];
	int objCount;
        Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	public CustomList(T[] genericObject, int objCount) {
		super();
		this.genericObject = genericObject;
		this.objCount = objCount;
	}

	public CustomList() 
        {
	}

	public void add(T objAdd) {

		if (objCount >= INITIAL_ARRAY_LENGTH) {

			T[] newGenericObject = (T[]) new Object[genericObject.length + 1];
			INITIAL_ARRAY_LENGTH++;

			for (int i = 0; i < genericObject.length; i++) {

				newGenericObject[i] = genericObject[i];

			}

			this.genericObject = newGenericObject;

			genericObject[objCount++] = objAdd;

		} else {

			genericObject[objCount++] = objAdd;

		}

	}

	public int size() {

		logger.log("object count: " + objCount);
		logger.log("genericObject.length: " + genericObject.length);
		logger.log("INITIAL_ARRAY_LENGTH " + INITIAL_ARRAY_LENGTH);

		return objCount;
	}

	public void displayCustomList() {

		for (int i = 0; i < genericObject.length; i++) {

			logger.log(genericObject[i]);
		}
	}

	// Removes first occurrence of objRemove
	public void remove(T objRemove) {
		for (int i = 0; i < genericObject.length; i++) {
			if (objRemove.equals(genericObject[i])) {

				T[] newGenericObject = (T[]) new Object[genericObject.length - 1];
				
				for (int j = i; j < genericObject.length-1 ; j++) {
					newGenericObject[j] = genericObject[j + 1];
				}

				for (int k = 0; k < i; k++) {
					newGenericObject[k] = genericObject[k];
				}
				
				genericObject = newGenericObject;
				
				objCount--;

				if (objCount > 3) {
					INITIAL_ARRAY_LENGTH--;
				}
                          }
		       }

	    }

	public T get(int index)
 {

		if (index >= genericObject.length || index < 0)
 {
			return null;
		}

		return genericObject[index];
	}
	

	public void clear() {

		INITIAL_ARRAY_LENGTH = 3;
		objCount = 0;
		T[] newGenericObject = (T[]) new Object[INITIAL_ARRAY_LENGTH];
		genericObject = null;
		genericObject = newGenericObject;

	}

	public void addAll(CustomList<T> addlist) {
		
		if(addlist == null) {
			
		}
		
		else {
		
			int additionalCapacity = 0, initObjCount = this.objCount;
			logger.log("objCount: "+objCount);
			objCount = objCount + addlist.size();
			logger.log("objCount: "+objCount);
			
			T[] newGenericObject = (T[]) new Object[objCount];
			INITIAL_ARRAY_LENGTH = objCount;		
			
			for(int j = 0; j < initObjCount; j++) {
				newGenericObject[j] = genericObject[j];
			}
			
            int temp = 0;
			for(int k=initObjCount; k<objCount; k++) {
				newGenericObject[k] = addlist.get(temp);
				temp++;
			}


			
			genericObject = newGenericObject;
			
		}
		
		

	}
}