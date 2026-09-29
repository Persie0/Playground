package vg;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import android.provider.Settings;
import android.util.Pair;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import p003a2.C0009a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p341qg.C8620f;
import p341qg.C8624j;
import p366rg.C8782c;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p535zg.C10489a;

/* JADX INFO: renamed from: vg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9722b extends AbstractC10357a {

    /* JADX INFO: renamed from: M */
    public static final C0076c f49734M;

    /* JADX INFO: renamed from: H */
    public final C8620f f49735H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC8786g f49736I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f49737J;

    /* JADX INFO: renamed from: K */
    public final C9721a f49738K;

    /* JADX INFO: renamed from: L */
    public long f49739L;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f49734M = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobIdentifiers");
    }

    public C9722b(InterfaceC10359c interfaceC10359c, C8620f c8620f, C8785f c8785f, C6330c c6330c) {
        super("JobIdentifiers", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f49738K = new C9721a();
        this.f49739L = 0L;
        this.f49735H = c8620f;
        this.f49736I = c8785f;
        this.f49737J = c6330c;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01db  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de A[Catch: all -> 0x01fc, TryCatch #19 {all -> 0x01fc, blocks: (B:84:0x0194, B:87:0x01a5, B:89:0x01b7, B:90:0x01bf, B:92:0x01c2, B:93:0x01c3, B:95:0x01cb, B:97:0x01cd, B:99:0x01cf, B:100:0x01d9, B:104:0x01de, B:106:0x01ea, B:107:0x01f1, B:110:0x01f6, B:113:0x01f9, B:115:0x01fb, B:105:0x01e5, B:91:0x01c0, B:108:0x01f2), top: B:229:0x0194, inners: #8, #16 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e5 A[Catch: all -> 0x01fc, TryCatch #19 {all -> 0x01fc, blocks: (B:84:0x0194, B:87:0x01a5, B:89:0x01b7, B:90:0x01bf, B:92:0x01c2, B:93:0x01c3, B:95:0x01cb, B:97:0x01cd, B:99:0x01cf, B:100:0x01d9, B:104:0x01de, B:106:0x01ea, B:107:0x01f1, B:110:0x01f6, B:113:0x01f9, B:115:0x01fb, B:105:0x01e5, B:91:0x01c0, B:108:0x01f2), top: B:229:0x0194, inners: #8, #16 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0228 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:121:0x0219, B:123:0x0228, B:124:0x0236, B:126:0x023a, B:127:0x023b, B:129:0x0243, B:131:0x0245, B:133:0x0247, B:134:0x0257, B:137:0x025c, B:140:0x025f, B:141:0x0260, B:125:0x0237, B:135:0x0258), top: B:199:0x0219, inners: #3, #21 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0247 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:121:0x0219, B:123:0x0228, B:124:0x0236, B:126:0x023a, B:127:0x023b, B:129:0x0243, B:131:0x0245, B:133:0x0247, B:134:0x0257, B:137:0x025c, B:140:0x025f, B:141:0x0260, B:125:0x0237, B:135:0x0258), top: B:199:0x0219, inners: #3, #21 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x028d A[Catch: all -> 0x02d7, TryCatch #15 {all -> 0x02d7, blocks: (B:147:0x027c, B:149:0x028d, B:150:0x02a8, B:153:0x02ae, B:154:0x02af, B:156:0x02b8, B:157:0x02b9, B:159:0x02bb, B:160:0x02ca, B:162:0x02d1, B:165:0x02d4, B:167:0x02d6, B:161:0x02cb, B:151:0x02a9), top: B:222:0x027c, inners: #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb A[Catch: all -> 0x02d7, TryCatch #15 {all -> 0x02d7, blocks: (B:147:0x027c, B:149:0x028d, B:150:0x02a8, B:153:0x02ae, B:154:0x02af, B:156:0x02b8, B:157:0x02b9, B:159:0x02bb, B:160:0x02ca, B:162:0x02d1, B:165:0x02d4, B:167:0x02d6, B:161:0x02cb, B:151:0x02a9), top: B:222:0x027c, inners: #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: all -> 0x00ff, TryCatch #23 {all -> 0x00ff, blocks: (B:31:0x00a7, B:33:0x00b7, B:34:0x00ce, B:37:0x00d4, B:38:0x00d5, B:40:0x00df, B:42:0x00e1, B:43:0x00e2, B:44:0x00f1, B:47:0x00f9, B:50:0x00fd, B:51:0x00fe, B:45:0x00f2, B:35:0x00cf), top: B:236:0x00a7, inners: #18, #22 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[Catch: all -> 0x00ff, TryCatch #23 {all -> 0x00ff, blocks: (B:31:0x00a7, B:33:0x00b7, B:34:0x00ce, B:37:0x00d4, B:38:0x00d5, B:40:0x00df, B:42:0x00e1, B:43:0x00e2, B:44:0x00f1, B:47:0x00f9, B:50:0x00fd, B:51:0x00fe, B:45:0x00f2, B:35:0x00cf), top: B:236:0x00a7, inners: #18, #22 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0130 A[Catch: all -> 0x0176, TryCatch #13 {all -> 0x0176, blocks: (B:58:0x011e, B:60:0x0130, B:61:0x0147, B:63:0x014d, B:64:0x014e, B:66:0x0157, B:68:0x0159, B:70:0x015b, B:71:0x016a, B:73:0x0170, B:76:0x0174, B:77:0x0175, B:72:0x016b, B:62:0x0148), top: B:219:0x011e, inners: #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015b A[Catch: all -> 0x0176, TryCatch #13 {all -> 0x0176, blocks: (B:58:0x011e, B:60:0x0130, B:61:0x0147, B:63:0x014d, B:64:0x014e, B:66:0x0157, B:68:0x0159, B:70:0x015b, B:71:0x016a, B:73:0x0170, B:76:0x0174, B:77:0x0175, B:72:0x016b, B:62:0x0148), top: B:219:0x011e, inners: #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        C8782c c8782cM17070c;
        boolean z10;
        C8782c c8782cM17070c2;
        C8782c c8782cM17070c3;
        C8782c c8782cM17070c4;
        String str;
        Integer num;
        C8782c c8782cM17070c5;
        String strM18229a;
        C8782c c8782cM17070c6;
        C8782c c8782cM17070c7;
        C8782c c8782cM17070c8;
        C8782c c8782cM17070c9;
        String str2;
        Boolean bool;
        C8782c c8782cM17070c10;
        C8782c c8782cM17070c11;
        String str3;
        Boolean bool2;
        C9721a c9721a = this.f49738K;
        InterfaceC8786g interfaceC8786g = this.f49736I;
        StringBuilder sb2 = new StringBuilder("Started at ");
        C8620f c8620f = this.f49735H;
        sb2.append(C5206f.m11023t1(c8620f.f46127a));
        sb2.append(" seconds");
        String string = sb2.toString();
        C0076c c0076c = f49734M;
        c0076c.m457a(string);
        boolean z11 = true;
        try {
            if (!((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "adid")) {
                C10489a.m19475a(c0076c, "Collection of ADID denied");
                C8782c c8782cM17070c12 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c12) {
                    try {
                        c8782cM17070c12.f46544d = null;
                        c8782cM17070c12.f46545e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                z10 = false;
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fire_adid")) {
                    Pair<String, Boolean> pairM18230b = c9721a.m18230b(c8620f.f46128b);
                    c8782cM17070c11 = ((C8785f) interfaceC8786g).m17070c();
                    str3 = (String) pairM18230b.first;
                    bool2 = (Boolean) pairM18230b.second;
                    synchronized (c8782cM17070c11) {
                        c8782cM17070c11.f46546f = str3;
                        c8782cM17070c11.f46547g = bool2;
                        c0076c.m457a("Collection of FIRE ADID succeeded");
                        z10 = true;
                    }
                } else {
                    c0076c.m457a("Collection of FIRE ADID denied");
                    c8782cM17070c10 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c10) {
                        c8782cM17070c10.f46546f = null;
                        c8782cM17070c10.f46547g = null;
                    }
                }
                if (!((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "oaid")) {
                    c0076c.m457a("Collection of OAID denied");
                    c8782cM17070c8 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c8) {
                        c8782cM17070c8.f46548h = null;
                        c8782cM17070c8.f46549i = null;
                        z11 = z10;
                        if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                            if (z11) {
                                c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                            } else {
                                c0076c.m457a("Collection of ANDROID ID denied");
                            }
                            c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                            synchronized (c8782cM17070c7) {
                                c8782cM17070c7.f46543c = null;
                            }
                        } else {
                            if (z11) {
                                c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                            } else {
                                c0076c.m457a("Collection of ANDROID ID denied");
                            }
                            c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                            synchronized (c8782cM17070c7) {
                                c8782cM17070c7.f46543c = null;
                            }
                        }
                        if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                            strM18229a = c9721a.m18229a(c8620f.f46128b);
                            c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                            synchronized (c8782cM17070c6) {
                                c8782cM17070c6.f46551k = strM18229a;
                                c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                            }
                        } else {
                            c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                            c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                            synchronized (c8782cM17070c5) {
                                c8782cM17070c5.f46551k = null;
                            }
                        }
                        if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                            Pair<String, Integer> pairM18232d = c9721a.m18232d(c8620f.f46128b);
                            c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                            str = (String) pairM18232d.first;
                            num = (Integer) pairM18232d.second;
                            synchronized (c8782cM17070c4) {
                                c8782cM17070c4.f46552l = str;
                                c8782cM17070c4.f46553m = num;
                                c0076c.m457a("Collection of ASID succeeded");
                            }
                        } else {
                            c0076c.m457a("Collection of ASID denied");
                            c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                            synchronized (c8782cM17070c3) {
                                c8782cM17070c3.f46552l = null;
                                c8782cM17070c3.f46553m = null;
                            }
                        }
                        this.f49739L = System.currentTimeMillis();
                    }
                }
                Pair<String, Boolean> pairM18233e = c9721a.m18233e(c8620f.f46128b);
                c8782cM17070c9 = ((C8785f) interfaceC8786g).m17070c();
                str2 = (String) pairM18233e.first;
                bool = (Boolean) pairM18233e.second;
                synchronized (c8782cM17070c9) {
                    c8782cM17070c9.f46548h = str2;
                    c8782cM17070c9.f46549i = bool;
                    c0076c.m457a("Collection of OAID succeeded");
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    } else {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                        strM18229a = c9721a.m18229a(c8620f.f46128b);
                        c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c6) {
                            c8782cM17070c6.f46551k = strM18229a;
                            c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                        c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c5) {
                            c8782cM17070c5.f46551k = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                        Pair<String, Integer> pairM18232d2 = c9721a.m18232d(c8620f.f46128b);
                        c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                        str = (String) pairM18232d2.first;
                        num = (Integer) pairM18232d2.second;
                        synchronized (c8782cM17070c4) {
                            c8782cM17070c4.f46552l = str;
                            c8782cM17070c4.f46553m = num;
                            c0076c.m457a("Collection of ASID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of ASID denied");
                        c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c3) {
                            c8782cM17070c3.f46552l = null;
                            c8782cM17070c3.f46553m = null;
                        }
                    }
                    this.f49739L = System.currentTimeMillis();
                }
                c0076c.m457a("Collection of OAID failed");
                c0076c.m459c(th.getMessage());
                c8782cM17070c2 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c2) {
                    c8782cM17070c2.f46548h = null;
                    c8782cM17070c2.f46549i = null;
                    z11 = z10;
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    } else {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                        strM18229a = c9721a.m18229a(c8620f.f46128b);
                        c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c6) {
                            c8782cM17070c6.f46551k = strM18229a;
                            c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                        c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c5) {
                            c8782cM17070c5.f46551k = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                        Pair<String, Integer> pairM18232d3 = c9721a.m18232d(c8620f.f46128b);
                        c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                        str = (String) pairM18232d3.first;
                        num = (Integer) pairM18232d3.second;
                        synchronized (c8782cM17070c4) {
                            c8782cM17070c4.f46552l = str;
                            c8782cM17070c4.f46553m = num;
                            c0076c.m457a("Collection of ASID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of ASID denied");
                        c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c3) {
                            c8782cM17070c3.f46552l = null;
                            c8782cM17070c3.f46553m = null;
                        }
                    }
                    this.f49739L = System.currentTimeMillis();
                }
            }
            Pair<String, Boolean> pairM18231c = c9721a.m18231c(c8620f.f46128b);
            C8782c c8782cM17070c13 = ((C8785f) interfaceC8786g).m17070c();
            String str4 = (String) pairM18231c.first;
            Boolean bool3 = (Boolean) pairM18231c.second;
            synchronized (c8782cM17070c13) {
                try {
                    c8782cM17070c13.f46544d = str4;
                    c8782cM17070c13.f46545e = bool3;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            C10489a.m19475a(c0076c, "Collection of ADID succeeded");
            z10 = true;
            try {
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fire_adid")) {
                    Pair<String, Boolean> pairM18230b2 = c9721a.m18230b(c8620f.f46128b);
                    c8782cM17070c11 = ((C8785f) interfaceC8786g).m17070c();
                    str3 = (String) pairM18230b2.first;
                    bool2 = (Boolean) pairM18230b2.second;
                    synchronized (c8782cM17070c11) {
                        try {
                            c8782cM17070c11.f46546f = str3;
                            c8782cM17070c11.f46547g = bool2;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c0076c.m457a("Collection of FIRE ADID succeeded");
                    z10 = true;
                } else {
                    c0076c.m457a("Collection of FIRE ADID denied");
                    c8782cM17070c10 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c10) {
                        c8782cM17070c10.f46546f = null;
                        c8782cM17070c10.f46547g = null;
                    }
                }
            } catch (Throwable th5) {
                c0076c.m457a("Collection of FIRE ADID failed");
                c0076c.m459c(th5.getMessage());
                C8782c c8782cM17070c14 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c14) {
                    try {
                        c8782cM17070c14.f46546f = null;
                        c8782cM17070c14.f46547g = null;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            }
            try {
                if (!((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "oaid")) {
                    c0076c.m457a("Collection of OAID denied");
                    c8782cM17070c8 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c8) {
                        c8782cM17070c8.f46548h = null;
                        c8782cM17070c8.f46549i = null;
                    }
                    z11 = z10;
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    } else {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                        strM18229a = c9721a.m18229a(c8620f.f46128b);
                        c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c6) {
                            c8782cM17070c6.f46551k = strM18229a;
                            c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                        c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c5) {
                            c8782cM17070c5.f46551k = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                        Pair<String, Integer> pairM18232d4 = c9721a.m18232d(c8620f.f46128b);
                        c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                        str = (String) pairM18232d4.first;
                        num = (Integer) pairM18232d4.second;
                        synchronized (c8782cM17070c4) {
                            c8782cM17070c4.f46552l = str;
                            c8782cM17070c4.f46553m = num;
                            c0076c.m457a("Collection of ASID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of ASID denied");
                        c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c3) {
                            c8782cM17070c3.f46552l = null;
                            c8782cM17070c3.f46553m = null;
                        }
                    }
                    this.f49739L = System.currentTimeMillis();
                }
                Pair<String, Boolean> pairM18233e2 = c9721a.m18233e(c8620f.f46128b);
                c8782cM17070c9 = ((C8785f) interfaceC8786g).m17070c();
                str2 = (String) pairM18233e2.first;
                bool = (Boolean) pairM18233e2.second;
                synchronized (c8782cM17070c9) {
                    try {
                        c8782cM17070c9.f46548h = str2;
                        c8782cM17070c9.f46549i = bool;
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                c0076c.m457a("Collection of OAID succeeded");
                try {
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id") || z11) {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            try {
                                c8782cM17070c7.f46543c = null;
                            } catch (Throwable th8) {
                                throw th8;
                            }
                        }
                    } else {
                        Context context = c8620f.f46128b;
                        c9721a.getClass();
                        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        if (string2 == null) {
                            throw new Exception("Cannot retrieve Android ID");
                        }
                        C8782c c8782cM17070c15 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c15) {
                            try {
                                c8782cM17070c15.f46543c = string2;
                            } catch (Throwable th9) {
                                throw th9;
                            }
                        }
                        c0076c.m457a("Collection of ANDROID ID succeeded");
                    }
                } catch (Throwable th10) {
                    c0076c.m457a("Collection of ANDROID ID failed");
                    c0076c.m459c(th10.getMessage());
                    C8782c c8782cM17070c16 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c16) {
                        c8782cM17070c16.f46543c = null;
                    }
                }
                try {
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                        strM18229a = c9721a.m18229a(c8620f.f46128b);
                        c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c6) {
                            try {
                                c8782cM17070c6.f46551k = strM18229a;
                            } catch (Throwable th11) {
                                throw th11;
                            }
                        }
                        c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                    } else {
                        c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                        c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c5) {
                            c8782cM17070c5.f46551k = null;
                        }
                    }
                } catch (Throwable th12) {
                    c0076c.m457a("Collection of FB ATTRIBUTION ID failed");
                    c0076c.m459c(th12.getMessage());
                    C8782c c8782cM17070c17 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c17) {
                        c8782cM17070c17.f46551k = null;
                    }
                }
                try {
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                        Pair<String, Integer> pairM18232d5 = c9721a.m18232d(c8620f.f46128b);
                        c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                        str = (String) pairM18232d5.first;
                        num = (Integer) pairM18232d5.second;
                        synchronized (c8782cM17070c4) {
                            c8782cM17070c4.f46552l = str;
                            c8782cM17070c4.f46553m = num;
                        }
                        c0076c.m457a("Collection of ASID succeeded");
                    } else {
                        c0076c.m457a("Collection of ASID denied");
                        c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c3) {
                            try {
                                c8782cM17070c3.f46552l = null;
                                c8782cM17070c3.f46553m = null;
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th13) {
                    c0076c.m457a("Collection of ASID failed");
                    c0076c.m459c(th13.getMessage());
                    C8782c c8782cM17070c18 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c18) {
                        c8782cM17070c18.f46552l = null;
                        c8782cM17070c18.f46553m = null;
                    }
                }
                this.f49739L = System.currentTimeMillis();
            } catch (Throwable th14) {
                c0076c.m457a("Collection of OAID failed");
                c0076c.m459c(th14.getMessage());
                c8782cM17070c2 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c2) {
                    c8782cM17070c2.f46548h = null;
                    c8782cM17070c2.f46549i = null;
                }
            }
            c0076c.m457a("Collection of OAID failed");
            c0076c.m459c(th14.getMessage());
            c8782cM17070c2 = ((C8785f) interfaceC8786g).m17070c();
            synchronized (c8782cM17070c2) {
                c8782cM17070c2.f46548h = null;
                c8782cM17070c2.f46549i = null;
                z11 = z10;
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                } else {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                    strM18229a = c9721a.m18229a(c8620f.f46128b);
                    c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c6) {
                        c8782cM17070c6.f46551k = strM18229a;
                        c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                    c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c5) {
                        c8782cM17070c5.f46551k = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                    Pair<String, Integer> pairM18232d6 = c9721a.m18232d(c8620f.f46128b);
                    c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                    str = (String) pairM18232d6.first;
                    num = (Integer) pairM18232d6.second;
                    synchronized (c8782cM17070c4) {
                        c8782cM17070c4.f46552l = str;
                        c8782cM17070c4.f46553m = num;
                        c0076c.m457a("Collection of ASID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of ASID denied");
                    c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c3) {
                        c8782cM17070c3.f46552l = null;
                        c8782cM17070c3.f46553m = null;
                    }
                }
                this.f49739L = System.currentTimeMillis();
            }
        } catch (Throwable th15) {
            C10489a.m19475a(c0076c, "Collection of ADID failed");
            c0076c.m459c(th15.getMessage());
            c8782cM17070c = ((C8785f) interfaceC8786g).m17070c();
            synchronized (c8782cM17070c) {
                c8782cM17070c.f46544d = null;
                c8782cM17070c.f46545e = null;
            }
        }
        C10489a.m19475a(c0076c, "Collection of ADID failed");
        c0076c.m459c(th15.getMessage());
        c8782cM17070c = ((C8785f) interfaceC8786g).m17070c();
        synchronized (c8782cM17070c) {
            c8782cM17070c.f46544d = null;
            c8782cM17070c.f46545e = null;
            z10 = false;
            if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fire_adid")) {
                Pair<String, Boolean> pairM18230b3 = c9721a.m18230b(c8620f.f46128b);
                c8782cM17070c11 = ((C8785f) interfaceC8786g).m17070c();
                str3 = (String) pairM18230b3.first;
                bool2 = (Boolean) pairM18230b3.second;
                synchronized (c8782cM17070c11) {
                    c8782cM17070c11.f46546f = str3;
                    c8782cM17070c11.f46547g = bool2;
                    c0076c.m457a("Collection of FIRE ADID succeeded");
                    z10 = true;
                }
            } else {
                c0076c.m457a("Collection of FIRE ADID denied");
                c8782cM17070c10 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c10) {
                    c8782cM17070c10.f46546f = null;
                    c8782cM17070c10.f46547g = null;
                }
            }
            if (!((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "oaid")) {
                c0076c.m457a("Collection of OAID denied");
                c8782cM17070c8 = ((C8785f) interfaceC8786g).m17070c();
                synchronized (c8782cM17070c8) {
                    c8782cM17070c8.f46548h = null;
                    c8782cM17070c8.f46549i = null;
                    z11 = z10;
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    } else {
                        if (z11) {
                            c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                        } else {
                            c0076c.m457a("Collection of ANDROID ID denied");
                        }
                        c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c7) {
                            c8782cM17070c7.f46543c = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                        strM18229a = c9721a.m18229a(c8620f.f46128b);
                        c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c6) {
                            c8782cM17070c6.f46551k = strM18229a;
                            c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                        c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c5) {
                            c8782cM17070c5.f46551k = null;
                        }
                    }
                    if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                        Pair<String, Integer> pairM18232d7 = c9721a.m18232d(c8620f.f46128b);
                        c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                        str = (String) pairM18232d7.first;
                        num = (Integer) pairM18232d7.second;
                        synchronized (c8782cM17070c4) {
                            c8782cM17070c4.f46552l = str;
                            c8782cM17070c4.f46553m = num;
                            c0076c.m457a("Collection of ASID succeeded");
                        }
                    } else {
                        c0076c.m457a("Collection of ASID denied");
                        c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                        synchronized (c8782cM17070c3) {
                            c8782cM17070c3.f46552l = null;
                            c8782cM17070c3.f46553m = null;
                        }
                    }
                    this.f49739L = System.currentTimeMillis();
                }
            }
            Pair<String, Boolean> pairM18233e3 = c9721a.m18233e(c8620f.f46128b);
            c8782cM17070c9 = ((C8785f) interfaceC8786g).m17070c();
            str2 = (String) pairM18233e3.first;
            bool = (Boolean) pairM18233e3.second;
            synchronized (c8782cM17070c9) {
                c8782cM17070c9.f46548h = str2;
                c8782cM17070c9.f46549i = bool;
                c0076c.m457a("Collection of OAID succeeded");
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                } else {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                    strM18229a = c9721a.m18229a(c8620f.f46128b);
                    c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c6) {
                        c8782cM17070c6.f46551k = strM18229a;
                        c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                    c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c5) {
                        c8782cM17070c5.f46551k = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                    Pair<String, Integer> pairM18232d8 = c9721a.m18232d(c8620f.f46128b);
                    c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                    str = (String) pairM18232d8.first;
                    num = (Integer) pairM18232d8.second;
                    synchronized (c8782cM17070c4) {
                        c8782cM17070c4.f46552l = str;
                        c8782cM17070c4.f46553m = num;
                        c0076c.m457a("Collection of ASID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of ASID denied");
                    c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c3) {
                        c8782cM17070c3.f46552l = null;
                        c8782cM17070c3.f46553m = null;
                    }
                }
                this.f49739L = System.currentTimeMillis();
            }
            c0076c.m457a("Collection of OAID failed");
            c0076c.m459c(th14.getMessage());
            c8782cM17070c2 = ((C8785f) interfaceC8786g).m17070c();
            synchronized (c8782cM17070c2) {
                c8782cM17070c2.f46548h = null;
                c8782cM17070c2.f46549i = null;
                z11 = z10;
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "android_id")) {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                } else {
                    if (z11) {
                        c0076c.m457a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                    } else {
                        c0076c.m457a("Collection of ANDROID ID denied");
                    }
                    c8782cM17070c7 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c7) {
                        c8782cM17070c7.f46543c = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "fb_attribution_id")) {
                    strM18229a = c9721a.m18229a(c8620f.f46128b);
                    c8782cM17070c6 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c6) {
                        c8782cM17070c6.f46551k = strM18229a;
                        c0076c.m457a("Collection of FB ATTRIBUTION ID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of FB ATTRIBUTION ID denied");
                    c8782cM17070c5 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c5) {
                        c8782cM17070c5.f46551k = null;
                    }
                }
                if (((C8785f) interfaceC8786g).m17072e(PayloadType.Install, "asid")) {
                    Pair<String, Integer> pairM18232d9 = c9721a.m18232d(c8620f.f46128b);
                    c8782cM17070c4 = ((C8785f) interfaceC8786g).m17070c();
                    str = (String) pairM18232d9.first;
                    num = (Integer) pairM18232d9.second;
                    synchronized (c8782cM17070c4) {
                        c8782cM17070c4.f46552l = str;
                        c8782cM17070c4.f46553m = num;
                        c0076c.m457a("Collection of ASID succeeded");
                    }
                } else {
                    c0076c.m457a("Collection of ASID denied");
                    c8782cM17070c3 = ((C8785f) interfaceC8786g).m17070c();
                    synchronized (c8782cM17070c3) {
                        c8782cM17070c3.f46552l = null;
                        c8782cM17070c3.f46553m = null;
                    }
                }
                this.f49739L = System.currentTimeMillis();
            }
        }
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        return 0L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        long j10;
        C6330c c6330c = (C6330c) this.f49737J;
        synchronized (c6330c) {
            try {
                j10 = c6330c.f36573h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (((C8624j) this.f49735H.f46137k)) {
        }
        boolean z10 = false;
        if (((C8624j) this.f49735H.f46137k).m16847b()) {
            return false;
        }
        if (j10 >= this.f49739L) {
            z10 = true;
        }
        return z10;
    }
}
