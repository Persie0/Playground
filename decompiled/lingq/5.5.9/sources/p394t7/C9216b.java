package p394t7;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.Regex;
import p173i8.C6205a;

/* JADX INFO: renamed from: t7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9216b {

    /* JADX INFO: renamed from: a */
    public static final C9216b f47825a = new C9216b();

    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #5 {all -> 0x010c, blocks: (B:6:0x0010, B:8:0x0015, B:20:0x0042, B:22:0x004e, B:33:0x0074, B:44:0x0098, B:57:0x00be, B:77:0x0101, B:55:0x00b7, B:42:0x0091, B:31:0x006c, B:18:0x003b, B:36:0x0083, B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0, B:48:0x00a8, B:12:0x0026, B:15:0x0032, B:25:0x005d), top: B:97:0x0010, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #5 {all -> 0x010c, blocks: (B:6:0x0010, B:8:0x0015, B:20:0x0042, B:22:0x004e, B:33:0x0074, B:44:0x0098, B:57:0x00be, B:77:0x0101, B:55:0x00b7, B:42:0x0091, B:31:0x006c, B:18:0x003b, B:36:0x0083, B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0, B:48:0x00a8, B:12:0x0026, B:15:0x0032, B:25:0x005d), top: B:97:0x0010, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #5 {all -> 0x010c, blocks: (B:6:0x0010, B:8:0x0015, B:20:0x0042, B:22:0x004e, B:33:0x0074, B:44:0x0098, B:57:0x00be, B:77:0x0101, B:55:0x00b7, B:42:0x0091, B:31:0x006c, B:18:0x003b, B:36:0x0083, B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0, B:48:0x00a8, B:12:0x0026, B:15:0x0032, B:25:0x005d), top: B:97:0x0010, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da A[Catch: all -> 0x0100, TryCatch #1 {all -> 0x0100, blocks: (B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0), top: B:89:0x00ce, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[Catch: all -> 0x0100, TryCatch #1 {all -> 0x0100, blocks: (B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0), top: B:89:0x00ce, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #1 {all -> 0x0100, blocks: (B:61:0x00ce, B:64:0x00da, B:66:0x00e0, B:72:0x00f0), top: B:89:0x00ce, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final boolean m17563b(View view) {
        boolean z10;
        boolean z11;
        TextView textView;
        boolean z12;
        TextView textView2;
        boolean z13;
        TextView textView3;
        String strM17573i;
        boolean z14;
        boolean zMatches;
        C9216b c9216b = f47825a;
        boolean z15 = false;
        if (C6205a.m12742b(C9216b.class)) {
            return false;
        }
        try {
            if (view instanceof TextView) {
                TextView textView4 = (TextView) view;
                c9216b.getClass();
                if (C6205a.m12742b(c9216b)) {
                    z10 = false;
                    if (!z10 || c9216b.m17564a((TextView) view)) {
                        z15 = true;
                    } else {
                        TextView textView5 = (TextView) view;
                        c9216b.getClass();
                        if (!C6205a.m12742b(c9216b)) {
                            try {
                                if (textView5.getInputType() == 96) {
                                    z11 = true;
                                }
                            } catch (Throwable th2) {
                                C6205a.m12741a(c9216b, th2);
                            }
                            if (z11) {
                                z15 = true;
                            } else {
                                textView = (TextView) view;
                                c9216b.getClass();
                                if (C6205a.m12742b(c9216b)) {
                                    try {
                                        if (textView.getInputType() == 112) {
                                            z12 = true;
                                        }
                                    } catch (Throwable th3) {
                                        C6205a.m12741a(c9216b, th3);
                                    }
                                    if (z12) {
                                        z15 = true;
                                    } else {
                                        textView2 = (TextView) view;
                                        c9216b.getClass();
                                        if (C6205a.m12742b(c9216b)) {
                                            z13 = false;
                                            if (z13) {
                                                z15 = true;
                                            } else {
                                                textView3 = (TextView) view;
                                                c9216b.getClass();
                                                if (C6205a.m12742b(c9216b)) {
                                                    try {
                                                        if (textView3.getInputType() == 32) {
                                                            zMatches = true;
                                                        } else {
                                                            strM17573i = C9218d.m17573i(textView3);
                                                            if (strM17573i == null) {
                                                                if (strM17573i.length() == 0) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = false;
                                                                }
                                                                if (z14) {
                                                                    zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        C6205a.m12741a(c9216b, th4);
                                                    }
                                                    if (zMatches) {
                                                        z15 = true;
                                                    }
                                                }
                                                zMatches = false;
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            }
                                        } else {
                                            try {
                                                if (textView2.getInputType() == 3) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                            } catch (Throwable th5) {
                                                C6205a.m12741a(c9216b, th5);
                                            }
                                            if (z13) {
                                                textView3 = (TextView) view;
                                                c9216b.getClass();
                                                if (C6205a.m12742b(c9216b)) {
                                                    if (textView3.getInputType() == 32) {
                                                        zMatches = true;
                                                    } else {
                                                        strM17573i = C9218d.m17573i(textView3);
                                                        if (strM17573i == null) {
                                                            if (strM17573i.length() == 0) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            if (z14) {
                                                                zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                            }
                                                        }
                                                    }
                                                    if (zMatches) {
                                                        z15 = true;
                                                    }
                                                }
                                                zMatches = false;
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                        }
                                    }
                                }
                                z12 = false;
                                if (z12) {
                                    textView2 = (TextView) view;
                                    c9216b.getClass();
                                    if (C6205a.m12742b(c9216b)) {
                                        z13 = false;
                                        if (z13) {
                                            textView3 = (TextView) view;
                                            c9216b.getClass();
                                            if (C6205a.m12742b(c9216b)) {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strM17573i = C9218d.m17573i(textView3);
                                                    if (strM17573i == null) {
                                                        if (strM17573i.length() == 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                        }
                                                    }
                                                }
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            }
                                            zMatches = false;
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    } else {
                                        if (textView2.getInputType() == 3) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            textView3 = (TextView) view;
                                            c9216b.getClass();
                                            if (C6205a.m12742b(c9216b)) {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strM17573i = C9218d.m17573i(textView3);
                                                    if (strM17573i == null) {
                                                        if (strM17573i.length() == 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                        }
                                                    }
                                                }
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            }
                                            zMatches = false;
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                } else {
                                    z15 = true;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            textView = (TextView) view;
                            c9216b.getClass();
                            if (C6205a.m12742b(c9216b)) {
                                if (textView.getInputType() == 112) {
                                    z12 = true;
                                }
                                if (z12) {
                                    textView2 = (TextView) view;
                                    c9216b.getClass();
                                    if (C6205a.m12742b(c9216b)) {
                                        z13 = false;
                                        if (z13) {
                                            textView3 = (TextView) view;
                                            c9216b.getClass();
                                            if (C6205a.m12742b(c9216b)) {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strM17573i = C9218d.m17573i(textView3);
                                                    if (strM17573i == null) {
                                                        if (strM17573i.length() == 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                        }
                                                    }
                                                }
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            }
                                            zMatches = false;
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    } else {
                                        if (textView2.getInputType() == 3) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            textView3 = (TextView) view;
                                            c9216b.getClass();
                                            if (C6205a.m12742b(c9216b)) {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strM17573i = C9218d.m17573i(textView3);
                                                    if (strM17573i == null) {
                                                        if (strM17573i.length() == 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                        }
                                                    }
                                                }
                                                if (zMatches) {
                                                    z15 = true;
                                                }
                                            }
                                            zMatches = false;
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                } else {
                                    z15 = true;
                                }
                            }
                            z12 = false;
                            if (z12) {
                                textView2 = (TextView) view;
                                c9216b.getClass();
                                if (C6205a.m12742b(c9216b)) {
                                    z13 = false;
                                    if (z13) {
                                        textView3 = (TextView) view;
                                        c9216b.getClass();
                                        if (C6205a.m12742b(c9216b)) {
                                            if (textView3.getInputType() == 32) {
                                                zMatches = true;
                                            } else {
                                                strM17573i = C9218d.m17573i(textView3);
                                                if (strM17573i == null) {
                                                    if (strM17573i.length() == 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                    }
                                                }
                                            }
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        }
                                        zMatches = false;
                                        if (zMatches) {
                                            z15 = true;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        textView3 = (TextView) view;
                                        c9216b.getClass();
                                        if (C6205a.m12742b(c9216b)) {
                                            if (textView3.getInputType() == 32) {
                                                zMatches = true;
                                            } else {
                                                strM17573i = C9218d.m17573i(textView3);
                                                if (strM17573i == null) {
                                                    if (strM17573i.length() == 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17573i).matches();
                                                    }
                                                }
                                            }
                                            if (zMatches) {
                                                z15 = true;
                                            }
                                        }
                                        zMatches = false;
                                        if (zMatches) {
                                            z15 = true;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                }
                            } else {
                                z15 = true;
                            }
                        } else {
                            z15 = true;
                        }
                    }
                } else {
                    try {
                        z10 = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                    } catch (Throwable th6) {
                        C6205a.m12741a(c9216b, th6);
                        z10 = false;
                    }
                    if (z10) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                }
            }
            return z15;
        } catch (Throwable th7) {
            C6205a.m12741a(C9216b.class, th7);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17564a(TextView textView) {
        int i10;
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            String strM14272c = new Regex("\\s").m14272c(C9218d.m17573i(textView), "");
            int length = strM14272c.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char cCharAt = strM14272c.charAt(i11);
                        if (!Character.isDigit(cCharAt)) {
                            return false;
                        }
                        int iDigit = Character.digit((int) cCharAt, 10);
                        if (iDigit < 0) {
                            throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                        }
                        if (z10 && (iDigit = iDigit * 2) > 9) {
                            iDigit = (iDigit % 10) + 1;
                        }
                        i10 += iDigit;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                return i10 % 10 == 0;
            }
            return false;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }
}
