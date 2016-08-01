import os
import sys;

script, title = sys.argv
try:
    #Write source code to file
    dirname=os.path.dirname(os.path.realpath(sys.argv[0]))
    src_directory = dirname + "/../main/java/jianye/algorithm/" + title
    if not os.path.exists(src_directory):
        os.makedirs(src_directory)
    src_filename = src_directory + "/" + title + ".java"
    if os.path.exists(src_filename):
        os.remove(src_filename);
    src_file_handle = open(src_filename, "wb")
    analysis_template = open(dirname + "/analysis.txt.template", "r")
    analysis_template_content = analysis_template.read();
    analysis_template.close()
    src_file_handle.write("\n" + analysis_template_content + "\n")

    src_file_handle.write("\n" + "package jianye.algorithm." + title + ";\n")
    class_template = open(dirname + "/class.java.template", "r")
    class_template_content = class_template.read();
    class_template.close()
    class_template_content = class_template_content.replace("%CLASS%", title)
    src_file_handle.write("\n" + class_template_content + "\n")
    src_file_handle.close()
    print "Generate question for " + title + " at " + src_directory

#write test code to file
    test_directory = dirname + "/../test/java/jianye/algorithm/" + title
    if not os.path.exists(test_directory):
        os.makedirs(test_directory)
    test_filename = test_directory + "/" + title + "Test.java"
    if os.path.exists(test_filename):
        os.remove(test_filename);
    test_file_handle = open(test_filename, "wb")
    test_file_handle.write("\n" + "package jianye.algorithm." + title + ";\n")
    test_template = open(dirname + "/unit_test.java.template", "r")
    test_template_content = test_template.read()
    test_template.close()
    test_template_content = test_template_content.replace("%CLASS%", title)
    test_template_content = test_template_content.replace("%TEST_CLASS%", title + "Test")
    lower_title = title[0].lower() + title[1:]
    test_template_content = test_template_content.replace("%class%", lower_title)
    test_file_handle.write(test_template_content + "\n")
    test_file_handle.close()
    print "Generate unit test for " + title + " at " + test_directory
except Exception, e:
    print str(e)
    sys.exit(1)

