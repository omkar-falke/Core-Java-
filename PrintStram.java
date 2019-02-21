public class java.io.PrintStream extends java.io.FilterOutputStream implements java.lang.Appendable,java.io.Closeable {
  public java.io.PrintStream(java.io.OutputStream);
  public java.io.PrintStream(java.io.OutputStream, boolean);
  public java.io.PrintStream(java.io.OutputStream, boolean, java.lang.String) throws java.io.UnsupportedEncodingException;
  public java.io.PrintStream(java.lang.String) throws java.io.FileNotFoundException;
  public java.io.PrintStream(java.lang.String, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;
  public java.io.PrintStream(java.io.File) throws java.io.FileNotFoundException;
  public java.io.PrintStream(java.io.File, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;
  public void flush();
  public void close();
  public boolean checkError();
  protected void setError();
  protected void clearError();
  public void write(int);
  public void write(byte[], int, int);
  public void print(boolean);
  public void print(char);
  public void print(int);
  public void print(long);
  public void print(float);
  public void print(double);
  public void print(char[]);
  public void print(java.lang.String);
  public void print(java.lang.Object);
  public void println();
  public void println(boolean);
  public void println(char);
  public void println(int);
  public void println(long);
  public void println(float);
  public void println(double);
  public void println(char[]);
  public void println(java.lang.String);
  public void println(java.lang.Object);
  public java.io.PrintStream printf(java.lang.String, java.lang.Object...);
  public java.io.PrintStream printf(java.util.Locale, java.lang.String, java.lang.Object...);
  public java.io.PrintStream format(java.lang.String, java.lang.Object...);
  public java.io.PrintStream format(java.util.Locale, java.lang.String, java.lang.Object...);
  public java.io.PrintStream append(java.lang.CharSequence);
  public java.io.PrintStream append(java.lang.CharSequence, int, int);
  public java.io.PrintStream append(char);
  public java.lang.Appendable append(char) throws java.io.IOException;
  public java.lang.Appendable append(java.lang.CharSequence, int, int) throws java.io.IOException;
  public java.lang.Appendable append(java.lang.CharSequence) throws java.io.IOException;
