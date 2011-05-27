/**
 *  Copyright (c) 1999-2011, Ecole des Mines de Nantes
 *  All rights reserved.
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *      * Redistributions of source code must retain the above copyright
 *        notice, this list of conditions and the following disclaimer.
 *      * Redistributions in binary form must reproduce the above copyright
 *        notice, this list of conditions and the following disclaimer in the
 *        documentation and/or other materials provided with the distribution.
 *      * Neither the name of the Ecole des Mines de Nantes nor the
 *        names of its contributors may be used to endorse or promote products
 *        derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 *  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package solver.variables.graph;

import solver.variables.graph.IActiveNodes;

/**
 * @author Jean-Guillaume Fages, Xavier Lorca
 * 
 * Provide an interface for the graph manipulation
 */
public interface IGraph {

	
	/**
	 * @return the collection of active nodes
	 */
	IActiveNodes getActiveNodes();
	
	/**Activate node x
	 * @param x
	 * @return true iff x was not already activated
	 */
	boolean activateNode(int x);
	
	/**Desactivate node x
	 * @param x
	 * @return true iff x was activated
	 */
	boolean desactivateNode(int x);
	
	/**test whether (x,y) is in the graph or not
	 * @param x
	 * @param y
	 * @return true iff (x,y) is in the graph
	 */
	boolean edgeExists(int x, int y);
	
	/**Add edge (x,y) to the graph
	 * @param x
	 * @param y
	 * @return true iff (x,y) was not already in the graph
	 */
	boolean addEdge(int x, int y);
	
	/**Remove edge (x,y) from the graph
	 * @param x
	 * @param y
	 * @return true iff (x,y) was in the graph
	 */
	boolean removeEdge(int x,int y);
	INeighbors getNeighborsOf(int x);
	
    /**
     * The number of nodes of the graph
     * @return the number of nodes of the graph
     */
    int getNbNodes();
    
    /**
     * Neighborhood size of node x
     * @param x node's index
     * @return the size of the neighborhood of node x
     */
    int getNeighborhoodSize(int x);

    /**Get the type of the graph
     * @return the type of the graph SPARSE or DENSE
     */
    GraphType getType();
    
}