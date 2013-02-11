/*
 * The MIT License
 *
 * Copyright (c) <2010> <Bruno P. Kinoshita>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.eti.kinoshita.testlinkjavaapi.constants;

/**
 *
 * <p>
 * <ul>
 * <li>20101130 - BUGID: 3123764 - kinow - reportTCresult not returning
 * execution data</li>
 * </ul>
 * </p>
 *
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 1.9.0-1
 */
public enum TestLinkResponseParams {

    ID("id"),
    NAME("name"),
    PREFIX("prefix"),
    NOTES("notes"),
    ACTIVE("active"),
    IS_PUBLIC("is_public"),
    OPT("opt"),
    REQUIREMENTS_ENABLED("requirementsEnabled"),
    TEST_PRIORITY_ENABLED("testPriorityEnabled"),
    AUTOMATION_ENABLED("automationEnabled"),
    INVENTORY_ENABLED("inventoryEnabled"),
    PROJECT_NAME("projectname"),
    FEATURE_ID("feature_id"),
    DETAILS("details"),
    PARENT_ID("parent_id"),
    ORDER("node_order"),
    VERSION("version"),
    ADDITIONAL_INFO("additionalInfo"),
    VERSION_NUMBER("version_number"),
    PRECONDITIONS("preconditions"),
    TEST_CASE_VERSION_ID("tcversion_id"),
    SUMMARY("summary"),
    IMPORTANCE("importance"),
    EXECUTION_TYPE("execution_type"),
    TC_ID("tc_id"),
    TEST_CASE_ID("testcase_id"),
    CONTENT("content"),
    FILE_TYPE("file_type"),
    TITLE("title"),
    BUILD_ID("build_id"),
    TESTER_ID("tester_id"),
    STATUS("status"),
    TEST_PLAN_ID("testplan_id"),
    TEST_CASE_VERSION_NUMBER("tcversion_number"),
    DEFAULT_VALUE("default_value"),
    DISPLAY_ORDER("display_order"),
    ENABLE_ON_DESIGN("enable_on_design"),
    ENABLE_ON_EXECUTION("enable_on_execution"),
    ENABLE_ON_TEST_PLAN_DESIGN("enable_on_testplan_design"),
    LABEL("label"),
    LENGTH_MAX("length_max"),
    LENGTH_MIN("length_min"),
    LOCATION("location"),
    POSSIBLE_VALUES("possible_values"),
    SHOW_ON_DESIGN("show_on_design"),
    SHOW_ON_EXECUTION("show_on_execution"),
    SHOW_ON_TEST_PLAN_DESIGN("show_on_testplan_design"),
    STEPS("steps"),
    TYPE("type"),
    VALID_REGEXP("valid_regexp"),
    VALUE("value"),
    CUSTOM_FIELDS("custom_fields"),
    OPERATIONS("operation"),
    OVERWRITE("overwrite"),
    MESSAGE("message"),
    BUG_ID_STATUS("bugidstatus"),
    CUSTOM_FIELD_STATUS("customfieldstatus"),
    EXEC_STATUS("exec_status"),
    EXECUTION_ORDER("execution_order"),
    ACTIONS("actions"),
    STEP_NUMBER("step_number"),
    EXPECTED_RESULTS("expected_results"),
    FULL_TEST_CASE_EXTERNAL_ID("full_tc_external_id"),
    EXTERNAL_ID("external_id"),
    FULL_EXTERNAL_ID("full_external_id")
    ;

    private String textValue;

    TestLinkResponseParams(String textValue) {
	this.textValue = textValue;
    }

    @Override
    public String toString() {
	return this.textValue;
    }

}
