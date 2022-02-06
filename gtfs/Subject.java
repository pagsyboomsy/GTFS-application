/*
 * This file is part of gtfstransitproject_group5.
 *
 * gtfstransitproject_group5 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * gtfstransitproject_group5 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with gtfstransitproject_group5.  If not, see <https://www.gnu.org/licenses/>.

 * Course: CS 2030 031
 * Fall 2021
 * GTFS Transit Project
 * Names: Jonathan Keane, Kevin Paganini, Kyle Senebouttarath
 * Created: 10/4/2021
 * Professor: Dr. Wright
 */
package gtfs;

/**
 * @author keanej, seneb
 *
 * This interface is a simple interface for sub
 */
public interface Subject {

	/**
	 * Add an observer to the subject.
	 * @param o Observer to add
	 */
	public void attach(Observer o);

	/**
	 * Remove an observer from the subject.
	 * @param o Observer to remove
	 */
	public void detach(Observer o);

	/**
	 * Go through all the observers stored and update them.
	 */
	public void notifyObservers();

}	//end interface Subject
