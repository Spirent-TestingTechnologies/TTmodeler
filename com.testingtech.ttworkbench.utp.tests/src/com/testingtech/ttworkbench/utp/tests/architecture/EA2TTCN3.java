/*
 * ----------------------------------------------------------------------------
 *  (C) Copyright Testing Technologies, 2009-2012.  All Rights Reserved.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     Testing Technologies - initial API and implementation
 *
 *  All copies of this program, whether in whole or in part, and whether
 *  modified or not, must display this and all other embedded copyright
 *  and ownership notices in full.
 *
 *  See the file COPYRIGHT for details of redistribution and use.
 *
 *  You should have received a copy of the COPYRIGHT file along with
 *  this file; if not, write to the Testing Technologies,
 *  Michaelkirchstr. 17/18, 10179 Berlin, Germany.
 *
 *  TESTING TECHNOLOGIES DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS
 *  SOFTWARE. IN NO EVENT SHALL TESTING TECHNOLOGIES BE LIABLE FOR ANY
 *  SPECIAL, DIRECT, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 *  WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN
 *  AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION,
 *  ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 *  THIS SOFTWARE.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 *  EITHER EXPRESSED OR IMPLIED, INCLUDING ANY KIND OF IMPLIED OR
 *  EXPRESSED WARRANTY OF NON-INFRINGEMENT OR THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.
 * -----------------------------------------------------------------------------
 */
package com.testingtech.ttworkbench.utp.tests.architecture;

import com.testingtech.ttworkbench.utp.tests.base.AbstractTests;

public class EA2TTCN3 extends AbstractTests {

  public final void testTestContextEmpty() throws Exception {

    eaTransformAndCheck("/input/testcontext-empty.EAP", "/output",
        "/testcontext-empty.uml");

    umlTransformAndCheck(getOutputPrjName(), getOutputPrjName(),
        "/output/testcontext-empty.uml", "/output-testcontext-empty-ttcn3",
        "RootTestContext.ttcn3", new String[]{
            "RootTestContext.ttcn3" //, "ATestContext.ttcn3"
        });

  }

  public final void testTestContext2() throws Exception {


    eaTransformAndCheck("/input/testcontext2.EAP", "/output",
        "testcontext2.uml");

    umlTransformAndCheck(getOutputPrjName(), getOutputPrjName(),
        "/output/testcontext2.uml", "/output-testcontext2-ttcn3",
        "RootTestContext2.ttcn3", new String[]{
            "RootTestContext2.ttcn3" //, "ATestContext.ttcn3"
        });

  }

  @Override
  public String getProjectName() {

    return "/architecture-ea2ttcn3";
  }

}
