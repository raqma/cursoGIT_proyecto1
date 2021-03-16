package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma2y4()
    {
        assertTrue( 6== Libreria.suma(2,4) );
    }
    
     @Test
    public void sumaMenos2y4()
    {
        assertTrue( 2== Libreria.suma(-2,4) );
    }
}
