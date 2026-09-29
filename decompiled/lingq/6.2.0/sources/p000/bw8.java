package p000;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.google.android.gms.internal.mlkit_vision_text_common.AbstractC0981l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class bw8 implements fm1, coa, bm1, InterfaceC2950e3, xk0, zk8, lkd, xoc, o9a {

    /* JADX INFO: renamed from: a */
    public static final bw8 f9099a = new bw8();

    /* JADX INFO: renamed from: b */
    public static final bw8 f9100b = new bw8();

    /* JADX INFO: renamed from: c */
    public static final bw8 f9101c = new bw8();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bw8 f9102d = new bw8();

    /* JADX INFO: renamed from: e */
    public static bw8 f9103e;

    public bw8(y95 y95Var) {
        y95Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final boolean m4197k(View view) {
        boolean z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String strM17042j;
        boolean zMatches;
        bw8 bw8Var = f9099a;
        Set set = lp1.f49971a;
        if (set.contains(bw8.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(bw8Var)) {
                z = false;
            } else {
                try {
                    z = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    lp1.m16420a(bw8Var, th);
                    z = false;
                }
            }
            if (!z && !bw8Var.m4205j((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (lp1.f49971a.contains(bw8Var)) {
                    textView = (TextView) view;
                    if (lp1.f49971a.contains(bw8Var)) {
                        textView2 = (TextView) view;
                        if (lp1.f49971a.contains(bw8Var)) {
                            textView3 = (TextView) view;
                            if (lp1.f49971a.contains(bw8Var)) {
                                zMatches = false;
                            } else {
                                try {
                                    if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null || strM17042j.length() == 0) {
                                            zMatches = false;
                                        } else {
                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strM17042j).matches();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    lp1.m16420a(bw8Var, th2);
                                }
                            }
                            if (!zMatches) {
                                return false;
                            }
                        } else {
                            try {
                                if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } catch (Throwable th3) {
                                lp1.m16420a(bw8Var, th3);
                            }
                        }
                    } else {
                        try {
                            if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (lp1.f49971a.contains(bw8Var)) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            lp1.m16420a(bw8Var, th4);
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() != 96) {
                            textView = (TextView) view;
                            if (lp1.f49971a.contains(bw8Var)) {
                                textView2 = (TextView) view;
                                if (lp1.f49971a.contains(bw8Var)) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } else if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (lp1.f49971a.contains(bw8Var)) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (lp1.f49971a.contains(bw8Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strM17042j = mta.m17042j(textView3);
                                        if (strM17042j != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        lp1.m16420a(bw8Var, th5);
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            lp1.m16420a(bw8.class, th6);
            return false;
        }
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: a */
    public boolean mo4198a() {
        return true;
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: b */
    public int mo4199b(p33 p33Var, m32 m32Var, int i) {
        m32Var.f8576b = 4;
        return -4;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: c */
    public void mo4200c() {
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        return (m88) obj;
    }

    @Override // p000.xk0
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: d */
    public int mo4201d(long j) {
        return 0;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) throws IOException {
        if (task.mo5971m()) {
            return (Bundle) task.mo5967i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.mo5966h())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo5966h());
    }

    @Override // p000.InterfaceC2950e3
    /* JADX INFO: renamed from: f */
    public String mo4202f() {
        return "fb_extend_sso_token";
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        return og4.m17978b(abstractC0875a, f);
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        zzvd zzvdVar = (zzvd) obj;
        float f = zzvdVar.f12160f;
        gs9 gs9Var = new gs9(zzvdVar.f12155a, zzvdVar.f12156b, zzvdVar.f12157c, zzvdVar.f12158d);
        AbstractC0981l.m5477a(zzvdVar.f12159e, new n58(13));
        return gs9Var;
    }

    @Override // p000.InterfaceC2950e3
    /* JADX INFO: renamed from: i */
    public String mo4204i() {
        return "oauth/access_token";
    }

    /* JADX INFO: renamed from: j */
    public boolean m4205j(TextView textView) {
        if (!lp1.f49971a.contains(this)) {
            try {
                String strM15428g = new Regex("\\s").m15428g(mta.m17042j(textView), "");
                int length = strM15428g.length();
                if (length >= 12 && length <= 19) {
                    int i = 0;
                    boolean z = false;
                    for (int i2 = length - 1; -1 < i2; i2--) {
                        char cCharAt = strM15428g.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            int iDigit = Character.digit((int) cCharAt, 10);
                            if (iDigit < 0) {
                                throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                            }
                            if (z && (iDigit = iDigit * 2) > 9) {
                                iDigit = (iDigit % 10) + 1;
                            }
                            i += iDigit;
                            z = !z;
                        }
                    }
                    if (i % 10 == 0) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return false;
            }
        }
        return false;
    }

    public bw8(si7 si7Var) {
        si7Var.getClass();
    }

    public bw8() {
    }
}
