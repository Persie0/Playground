package androidx.compose.p002ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3550rv;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.ahd;
import p000.ba3;
import p000.chd;
import p000.d16;
import p000.e28;
import p000.ea2;
import p000.fa2;
import p000.fa4;
import p000.gi4;
import p000.gm5;
import p000.h66;
import p000.i54;
import p000.ij6;
import p000.ir9;
import p000.k40;
import p000.la3;
import p000.o93;
import p000.om0;
import p000.om8;
import p000.t93;
import p000.te1;
import p000.u93;
import p000.ui3;
import p000.v93;
import p000.vi3;
import p000.x66;
import p000.x93;
import p000.z56;
import p000.z93;

/* JADX INFO: renamed from: androidx.compose.ui.focus.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0301c implements InterfaceC0300b {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f3906a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f3907b;

    /* JADX INFO: renamed from: d */
    public final C0299a f3909d;

    /* JADX INFO: renamed from: f */
    public z56 f3911f;

    /* JADX INFO: renamed from: h */
    public C0302d f3913h;

    /* JADX INFO: renamed from: c */
    public final C0302d f3908c = new C0302d(2, null, 14);

    /* JADX INFO: renamed from: e */
    public final v93 f3910e = new v93(this);

    /* JADX INFO: renamed from: g */
    public final h66 f3912g = new h66(1);

    public C0301c(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2) {
        this.f3906a = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f3907b = viewTreeObserverOnGlobalLayoutListenerC0391c2;
        this.f3909d = new C0299a(this, viewTreeObserverOnGlobalLayoutListenerC0391c2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1357c(boolean z) {
        k40 k40Var;
        if (m1362h() != null) {
            C0302d c0302dM1362h = m1362h();
            m1365k(null);
            if (c0302dM1362h != null) {
                c0302dM1362h.m1369a1(FocusStateImpl.Active, FocusStateImpl.Inactive);
                if (!c0302dM1362h.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var = c0302dM1362h.f34837a.f34841e;
                C0357g c0357gM21979L = te1.m21979L(c0302dM1362h);
                while (c0357gM21979L != null) {
                    if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                        while (d16Var != null) {
                            if ((d16Var.f34839c & 1024) != 0) {
                                d16 d16VarM21992f = d16Var;
                                x66 x66Var = null;
                                while (d16VarM21992f != null) {
                                    if (d16VarM21992f instanceof C0302d) {
                                        ((C0302d) d16VarM21992f).m1369a1(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                        int i = 0;
                                        for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                            if ((d16Var2.f34839c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    d16VarM21992f = d16Var2;
                                                } else {
                                                    if (x66Var == null) {
                                                        x66Var = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f != null) {
                                                        x66Var.m24305c(d16VarM21992f);
                                                        d16VarM21992f = null;
                                                    }
                                                    x66Var.m24305c(d16Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                            d16Var = d16Var.f34841e;
                        }
                    }
                    c0357gM21979L = c0357gM21979L.m1610w();
                    d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1358d(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            m1357c(z);
        } else {
            int i2 = u93.f63610a[AbstractC0303e.m1376a(this.f3908c, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z3 = false;
            } else {
                if (i2 != 4) {
                    gm5.m12750e();
                    return false;
                }
                m1357c(z);
            }
        }
        if (z3 && z2) {
            m1359e();
        }
        return z3;
    }

    /* JADX INFO: renamed from: e */
    public final void m1359e() {
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f3906a;
        if (viewTreeObserverOnGlobalLayoutListenerC0391c.isFocused() || viewTreeObserverOnGlobalLayoutListenerC0391c.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC0391c.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC0391c.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC0391c.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC0391c.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0157 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0160 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0149 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[ADDED_TO_REGION, LOOP:12: B:39:0x0078->B:67:0x00c4, LOOP_START, PHI: r6
      0x0078: PHI (r6v29 d16) = (r6v23 d16), (r6v30 d16) binds: [B:38:0x0076, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0102 A[ADDED_TO_REGION, LOOP:16: B:85:0x0102->B:113:0x014e, LOOP_START, PHI: r12
      0x0102: PHI (r12v14 d16) = (r12v8 d16), (r12v15 d16) binds: [B:84:0x0100, B:113:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [x66] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [x66] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v25, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v29, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v30, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v34, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [x66] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX INFO: renamed from: f */
    public final boolean m1360f(KeyEvent keyEvent, ui3 ui3Var) {
        d16 d16Var;
        C0357g c0357gM21979L;
        ea2 ea2Var;
        ea2 ea2Var2;
        d16 d16Var2;
        k40 k40Var;
        d16 d16VarM21992f;
        x66 x66Var;
        d16 d16Var3;
        C0357g c0357gM21979L2;
        ea2 ea2Var3;
        ea2 ea2Var4;
        k40 k40Var2;
        x66 x66Var2;
        d16 d16VarM21992f2;
        int size;
        k40 k40Var3;
        boolean z;
        C0302d c0302d = this.f3908c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f3909d.f3905e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!m1366l(keyEvent)) {
                Trace.endSection();
                return false;
            }
            C0302d c0302dM23497h = AbstractC3695vr.m23497h(c0302d);
            if (c0302dM23497h != null) {
                if (!c0302dM23497h.f34837a.f34836I) {
                    i54.m13663b("visitLocalDescendants called on an unattached node");
                }
                d16 d16Var4 = c0302dM23497h.f34837a;
                if ((d16Var4.f34840d & 9216) != 0) {
                    d16Var2 = null;
                    for (d16 d16Var5 = d16Var4.f34842f; d16Var5 != null; d16Var5 = d16Var5.f34842f) {
                        int i = d16Var5.f34839c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            d16Var2 = d16Var5;
                        }
                    }
                } else {
                    d16Var2 = null;
                }
                if (d16Var2 == null) {
                    if (c0302dM23497h == null) {
                        if (!c0302d.f34837a.f34836I) {
                            i54.m13663b("visitAncestors called on an unattached node");
                        }
                        d16Var = c0302d.f34837a.f34841e;
                        c0357gM21979L = te1.m21979L(c0302d);
                        loop15: while (true) {
                            if (c0357gM21979L != null) {
                                ea2Var = null;
                                break;
                            }
                            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 8192) != 0) {
                                while (d16Var != null) {
                                    if ((d16Var.f34839c & 8192) != 0) {
                                        d16VarM21992f = d16Var;
                                        x66Var = null;
                                        while (d16VarM21992f != null) {
                                            if (d16VarM21992f instanceof gi4) {
                                                ea2Var = d16VarM21992f;
                                                break loop15;
                                            }
                                            if ((d16VarM21992f.f34839c & 8192) == 0) {
                                            }
                                            d16VarM21992f = te1.m21992f(x66Var);
                                        }
                                    }
                                    d16Var = d16Var.f34841e;
                                }
                            }
                            c0357gM21979L = c0357gM21979L.m1610w();
                            if (c0357gM21979L != null) {
                            }
                        }
                        ea2Var2 = (gi4) ea2Var;
                        if (ea2Var2 != null) {
                            d16Var2 = ((d16) ea2Var2).f34837a;
                        } else {
                            d16Var2 = null;
                        }
                    } else {
                        if (!c0302dM23497h.f34837a.f34836I) {
                            i54.m13663b("visitAncestors called on an unattached node");
                        }
                        d16Var3 = c0302dM23497h.f34837a;
                        c0357gM21979L2 = te1.m21979L(c0302dM23497h);
                        loop11: while (true) {
                            if (c0357gM21979L2 != null) {
                                ea2Var3 = null;
                                break;
                            }
                            if ((((d16) c0357gM21979L2.f4335a0.f46679g).f34840d & 8192) != 0) {
                                while (d16Var3 != null) {
                                    if ((d16Var3.f34839c & 8192) != 0) {
                                        x66Var2 = null;
                                        d16VarM21992f2 = d16Var3;
                                        while (d16VarM21992f2 != null) {
                                            if (d16VarM21992f2 instanceof gi4) {
                                                ea2Var3 = d16VarM21992f2;
                                                break loop11;
                                            }
                                            if ((d16VarM21992f2.f34839c & 8192) == 0) {
                                            }
                                            d16VarM21992f2 = te1.m21992f(x66Var2);
                                        }
                                    }
                                    d16Var3 = d16Var3.f34841e;
                                }
                            }
                            c0357gM21979L2 = c0357gM21979L2.m1610w();
                            if (c0357gM21979L2 != null) {
                            }
                        }
                        ea2Var4 = (gi4) ea2Var3;
                        if (ea2Var4 != null) {
                            d16Var2 = ((d16) ea2Var4).f34837a;
                        } else {
                            if (!c0302d.f34837a.f34836I) {
                                i54.m13663b("visitAncestors called on an unattached node");
                            }
                            d16Var = c0302d.f34837a.f34841e;
                            c0357gM21979L = te1.m21979L(c0302d);
                            loop15: while (true) {
                                if (c0357gM21979L != null) {
                                    ea2Var = null;
                                    break;
                                }
                                if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 8192) != 0) {
                                    while (d16Var != null) {
                                        if ((d16Var.f34839c & 8192) != 0) {
                                            d16VarM21992f = d16Var;
                                            x66Var = null;
                                            while (d16VarM21992f != null) {
                                                if (d16VarM21992f instanceof gi4) {
                                                    ea2Var = d16VarM21992f;
                                                    break loop15;
                                                }
                                                if ((d16VarM21992f.f34839c & 8192) == 0) {
                                                }
                                                d16VarM21992f = te1.m21992f(x66Var);
                                            }
                                        }
                                        d16Var = d16Var.f34841e;
                                    }
                                }
                                c0357gM21979L = c0357gM21979L.m1610w();
                                if (c0357gM21979L != null) {
                                }
                            }
                            ea2Var2 = (gi4) ea2Var;
                            if (ea2Var2 != null) {
                                d16Var2 = ((d16) ea2Var2).f34837a;
                            } else {
                                d16Var2 = null;
                            }
                        }
                    }
                }
            } else if (c0302dM23497h == null) {
                if (!c0302d.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16Var = c0302d.f34837a.f34841e;
                c0357gM21979L = te1.m21979L(c0302d);
                loop15: while (true) {
                    if (c0357gM21979L != null) {
                        ea2Var = null;
                        break;
                    }
                    if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 8192) != 0) {
                        while (d16Var != null) {
                            if ((d16Var.f34839c & 8192) != 0) {
                                d16VarM21992f = d16Var;
                                x66Var = null;
                                while (d16VarM21992f != null) {
                                    if (d16VarM21992f instanceof gi4) {
                                        ea2Var = d16VarM21992f;
                                        break loop15;
                                    }
                                    if ((d16VarM21992f.f34839c & 8192) == 0 && (d16VarM21992f instanceof fa2)) {
                                        d16 d16Var6 = ((fa2) d16VarM21992f).f38701K;
                                        int i2 = 0;
                                        while (d16Var6 != null) {
                                            if ((d16Var6.f34839c & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    d16VarM21992f = d16VarM21992f;
                                                    x66Var = x66Var;
                                                    x66Var = x66Var;
                                                    d16VarM21992f = d16Var6;
                                                } else {
                                                    if (x66Var == null) {
                                                        x66Var = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f != null) {
                                                        x66Var.m24305c(d16VarM21992f);
                                                        d16VarM21992f = null;
                                                    }
                                                    x66Var.m24305c(d16Var6);
                                                }
                                            } else {
                                                d16VarM21992f = d16VarM21992f;
                                                x66Var = x66Var;
                                            }
                                            d16Var6 = d16Var6.f34842f;
                                            d16VarM21992f = d16VarM21992f;
                                            x66Var = x66Var;
                                        }
                                        if (i2 == 1) {
                                            d16VarM21992f = d16VarM21992f;
                                            x66Var = x66Var;
                                        } else {
                                            d16VarM21992f = d16VarM21992f;
                                            x66Var = x66Var;
                                        }
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                            d16Var = d16Var.f34841e;
                        }
                    }
                    c0357gM21979L = c0357gM21979L.m1610w();
                    d16Var = (c0357gM21979L != null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                }
                ea2Var2 = (gi4) ea2Var;
                if (ea2Var2 != null) {
                    d16Var2 = ((d16) ea2Var2).f34837a;
                } else {
                    d16Var2 = null;
                }
            } else {
                if (!c0302dM23497h.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16Var3 = c0302dM23497h.f34837a;
                c0357gM21979L2 = te1.m21979L(c0302dM23497h);
                loop11: while (true) {
                    if (c0357gM21979L2 != null) {
                        ea2Var3 = null;
                        break;
                    }
                    if ((((d16) c0357gM21979L2.f4335a0.f46679g).f34840d & 8192) != 0) {
                        while (d16Var3 != null) {
                            if ((d16Var3.f34839c & 8192) != 0) {
                                x66Var2 = null;
                                d16VarM21992f2 = d16Var3;
                                while (d16VarM21992f2 != null) {
                                    if (d16VarM21992f2 instanceof gi4) {
                                        ea2Var3 = d16VarM21992f2;
                                        break loop11;
                                    }
                                    if ((d16VarM21992f2.f34839c & 8192) == 0 && (d16VarM21992f2 instanceof fa2)) {
                                        d16 d16Var7 = ((fa2) d16VarM21992f2).f38701K;
                                        int i3 = 0;
                                        while (d16Var7 != null) {
                                            if ((d16Var7.f34839c & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    d16VarM21992f2 = d16VarM21992f2;
                                                    x66Var2 = x66Var2;
                                                    x66Var2 = x66Var2;
                                                    d16VarM21992f2 = d16Var7;
                                                } else {
                                                    if (x66Var2 == null) {
                                                        x66Var2 = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f2 != null) {
                                                        x66Var2.m24305c(d16VarM21992f2);
                                                        d16VarM21992f2 = null;
                                                    }
                                                    x66Var2.m24305c(d16Var7);
                                                }
                                            } else {
                                                d16VarM21992f2 = d16VarM21992f2;
                                                x66Var2 = x66Var2;
                                            }
                                            d16Var7 = d16Var7.f34842f;
                                            d16VarM21992f2 = d16VarM21992f2;
                                            x66Var2 = x66Var2;
                                        }
                                        if (i3 == 1) {
                                            d16VarM21992f2 = d16VarM21992f2;
                                            x66Var2 = x66Var2;
                                        } else {
                                            d16VarM21992f2 = d16VarM21992f2;
                                            x66Var2 = x66Var2;
                                        }
                                    }
                                    d16VarM21992f2 = te1.m21992f(x66Var2);
                                }
                            }
                            d16Var3 = d16Var3.f34841e;
                        }
                    }
                    c0357gM21979L2 = c0357gM21979L2.m1610w();
                    d16Var3 = (c0357gM21979L2 != null || (k40Var2 = c0357gM21979L2.f4335a0) == null) ? null : (ir9) k40Var2.f46678f;
                }
                ea2Var4 = (gi4) ea2Var3;
                if (ea2Var4 != null) {
                    d16Var2 = ((d16) ea2Var4).f34837a;
                } else {
                    if (!c0302d.f34837a.f34836I) {
                        i54.m13663b("visitAncestors called on an unattached node");
                    }
                    d16Var = c0302d.f34837a.f34841e;
                    c0357gM21979L = te1.m21979L(c0302d);
                    loop15: while (true) {
                        if (c0357gM21979L != null) {
                            ea2Var = null;
                            break;
                        }
                        if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 8192) != 0) {
                            while (d16Var != null) {
                                if ((d16Var.f34839c & 8192) != 0) {
                                    d16VarM21992f = d16Var;
                                    x66Var = null;
                                    while (d16VarM21992f != null) {
                                        if (d16VarM21992f instanceof gi4) {
                                            ea2Var = d16VarM21992f;
                                            break loop15;
                                        }
                                        if ((d16VarM21992f.f34839c & 8192) == 0) {
                                        }
                                        d16VarM21992f = te1.m21992f(x66Var);
                                    }
                                }
                                d16Var = d16Var.f34841e;
                            }
                        }
                        c0357gM21979L = c0357gM21979L.m1610w();
                        if (c0357gM21979L != null) {
                        }
                    }
                    ea2Var2 = (gi4) ea2Var;
                    if (ea2Var2 != null) {
                        d16Var2 = ((d16) ea2Var2).f34837a;
                    } else {
                        d16Var2 = null;
                    }
                }
            }
            if (d16Var2 != null) {
                if (!d16Var2.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var8 = d16Var2.f34837a.f34841e;
                C0357g c0357gM21979L3 = te1.m21979L(d16Var2);
                ArrayList arrayList = null;
                while (c0357gM21979L3 != null) {
                    if ((((d16) c0357gM21979L3.f4335a0.f46679g).f34840d & 8192) != 0) {
                        while (d16Var8 != null) {
                            if ((d16Var8.f34839c & 8192) != 0) {
                                d16 d16VarM21992f3 = d16Var8;
                                x66 x66Var3 = null;
                                while (d16VarM21992f3 != null) {
                                    if (d16VarM21992f3 instanceof gi4) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(d16VarM21992f3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (d16VarM21992f3.f34839c & 8192) != 0 && (d16VarM21992f3 instanceof fa2)) {
                                        int i4 = 0;
                                        for (d16 d16Var9 = ((fa2) d16VarM21992f3).f38701K; d16Var9 != null; d16Var9 = d16Var9.f34842f) {
                                            if ((d16Var9.f34839c & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    d16VarM21992f3 = d16Var9;
                                                } else {
                                                    if (x66Var3 == null) {
                                                        x66Var3 = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f3 != null) {
                                                        x66Var3.m24305c(d16VarM21992f3);
                                                        d16VarM21992f3 = null;
                                                    }
                                                    x66Var3.m24305c(d16Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    d16VarM21992f3 = te1.m21992f(x66Var3);
                                }
                            }
                            d16Var8 = d16Var8.f34841e;
                        }
                    }
                    c0357gM21979L3 = c0357gM21979L3.m1610w();
                    d16Var8 = (c0357gM21979L3 == null || (k40Var3 = c0357gM21979L3.f4335a0) == null) ? null : (ir9) k40Var3.f46678f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((gi4) arrayList.get(size)).mo801n(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M21992f = d16Var2.f34837a;
                ?? x66Var4 = 0;
                while (M21992f != 0) {
                    if (M21992f instanceof gi4) {
                        if (((gi4) M21992f).mo801n(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M21992f.f34839c & 8192) != 0 && (M21992f instanceof fa2)) {
                        d16 d16Var10 = ((fa2) M21992f).f38701K;
                        int i6 = 0;
                        while (d16Var10 != null) {
                            if ((d16Var10.f34839c & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    x66Var4 = x66Var4;
                                    M21992f = M21992f;
                                    x66Var4 = x66Var4;
                                    M21992f = d16Var10;
                                } else {
                                    if (x66Var4 == 0) {
                                        x66Var4 = new x66(new d16[16]);
                                    }
                                    if (M21992f != 0) {
                                        x66Var4.m24305c(M21992f);
                                        M21992f = 0;
                                    }
                                    x66Var4.m24305c(d16Var10);
                                }
                            } else {
                                x66Var4 = x66Var4;
                                M21992f = M21992f;
                            }
                            d16Var10 = d16Var10.f34842f;
                            x66Var4 = x66Var4;
                            M21992f = M21992f;
                        }
                        if (i6 == 1) {
                            x66Var4 = x66Var4;
                            M21992f = M21992f;
                        } else {
                            x66Var4 = x66Var4;
                            M21992f = M21992f;
                        }
                    }
                    M21992f = te1.m21992f(x66Var4);
                }
                if (((Boolean) ui3Var.mo0a()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? M21992f2 = d16Var2.f34837a;
                ?? x66Var5 = 0;
                while (M21992f2 != 0) {
                    if (M21992f2 instanceof gi4) {
                        if (((gi4) M21992f2).mo788I(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M21992f2.f34839c & 8192) != 0 && (M21992f2 instanceof fa2)) {
                        d16 d16Var11 = ((fa2) M21992f2).f38701K;
                        int i7 = 0;
                        while (d16Var11 != null) {
                            if ((d16Var11.f34839c & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    M21992f2 = M21992f2;
                                    x66Var5 = x66Var5;
                                    x66Var5 = x66Var5;
                                    M21992f2 = d16Var11;
                                } else {
                                    if (x66Var5 == 0) {
                                        x66Var5 = new x66(new d16[16]);
                                    }
                                    if (M21992f2 != 0) {
                                        x66Var5.m24305c(M21992f2);
                                        M21992f2 = 0;
                                    }
                                    x66Var5.m24305c(d16Var11);
                                }
                            } else {
                                M21992f2 = M21992f2;
                                x66Var5 = x66Var5;
                            }
                            d16Var11 = d16Var11.f34842f;
                            M21992f2 = M21992f2;
                            x66Var5 = x66Var5;
                        }
                        if (i7 == 1) {
                            M21992f2 = M21992f2;
                            x66Var5 = x66Var5;
                        } else {
                            M21992f2 = M21992f2;
                            x66Var5 = x66Var5;
                        }
                    }
                    M21992f2 = te1.m21992f(x66Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((gi4) arrayList.get(i8)).mo788I(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Boolean m1361g(int i, e28 e28Var, vi3 vi3Var) {
        C0302d c0302d;
        k40 k40Var;
        C0302d c0302d2 = this.f3908c;
        C0302d c0302dM23497h = AbstractC3695vr.m23497h(c0302d2);
        int i2 = 4;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f3907b;
        boolean zBooleanValue = false;
        if (c0302dM23497h != null) {
            LayoutDirection layoutDirection = viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutDirection();
            x93 x93VarM1370b1 = c0302dM23497h.m1370b1();
            z93 z93Var = x93VarM1370b1.f67967h;
            z93 z93Var2 = x93VarM1370b1.f67968i;
            if (i == 1) {
                z93Var = x93VarM1370b1.f67961b;
            } else if (i == 2) {
                z93Var = x93VarM1370b1.f67962c;
            } else if (i == 5) {
                z93Var = x93VarM1370b1.f67963d;
            } else if (i == 6) {
                z93Var = x93VarM1370b1.f67964e;
            } else if (i == 3) {
                int i3 = la3.f49363a[layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        gm5.m12750e();
                        return null;
                    }
                    z93Var = z93Var2;
                }
                if (z93Var == z93.f71219b) {
                    z93Var = null;
                }
                if (z93Var == null) {
                    z93Var = x93VarM1370b1.f67965f;
                }
            } else if (i == 4) {
                int i4 = la3.f49363a[layoutDirection.ordinal()];
                if (i4 == 1) {
                    z93Var = z93Var2;
                } else if (i4 != 2) {
                    gm5.m12750e();
                    return null;
                }
                if (z93Var == z93.f71219b) {
                    z93Var = null;
                }
                if (z93Var == null) {
                    z93Var = x93VarM1370b1.f67966g;
                }
            } else {
                if (i != 7 && i != 8) {
                    C3386nv.m17633t("invalid FocusDirection");
                    return null;
                }
                om0 om0Var = new om0(i);
                C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302dM23497h)).getFocusOwner();
                C0302d c0302dM1362h = c0301c.m1362h();
                if (i == 7) {
                    x93VarM1370b1.f67969j.invoke(om0Var);
                } else {
                    x93VarM1370b1.f67970k.invoke(om0Var);
                }
                z93Var = om0Var.f54563b ? z93.f71220c : c0302dM1362h != c0301c.m1362h() ? z93.f71221d : z93.f71219b;
            }
            z93 z93Var3 = z93.f71220c;
            if (!fa4.m11650l(z93Var, z93Var3)) {
                if (fa4.m11650l(z93Var, z93.f71221d)) {
                    C0302d c0302dM23497h2 = AbstractC3695vr.m23497h(c0302d2);
                    if (c0302dM23497h2 != null) {
                        return (Boolean) vi3Var.invoke(c0302dM23497h2);
                    }
                } else {
                    z93 z93Var4 = z93.f71219b;
                    if (!fa4.m11650l(z93Var, z93Var4)) {
                        if (z93Var == z93Var4) {
                            C3386nv.m17633t("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (z93Var == z93Var3) {
                            C3386nv.m17633t("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        x66 x66Var = z93Var.f71222a;
                        int i5 = x66Var.f67832c;
                        if (i5 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = x66Var.f67830a;
                            boolean z = false;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ea2 ea2Var = (ba3) objArr[i6];
                                if (!((d16) ea2Var).f34837a.f34836I) {
                                    i54.m13663b("visitChildren called on an unattached node");
                                }
                                x66 x66Var2 = new x66(new d16[16]);
                                d16 d16Var = ((d16) ea2Var).f34837a;
                                d16 d16Var2 = d16Var.f34842f;
                                if (d16Var2 == null) {
                                    te1.m21990d(x66Var2, d16Var);
                                } else {
                                    x66Var2.m24305c(d16Var2);
                                }
                                while (true) {
                                    int i7 = x66Var2.f67832c;
                                    if (i7 == 0) {
                                        break;
                                    }
                                    d16 d16VarM21992f = (d16) x66Var2.m24314l(i7 - 1);
                                    if ((d16VarM21992f.f34840d & 1024) == 0) {
                                        te1.m21990d(x66Var2, d16VarM21992f);
                                    } else {
                                        while (d16VarM21992f != null) {
                                            if ((d16VarM21992f.f34839c & 1024) != 0) {
                                                x66 x66Var3 = null;
                                                while (d16VarM21992f != null) {
                                                    if (d16VarM21992f instanceof C0302d) {
                                                        if (((Boolean) vi3Var.invoke((C0302d) d16VarM21992f)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                                        int i8 = 0;
                                                        for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                                            if ((d16Var3.f34839c & 1024) != 0) {
                                                                i8++;
                                                                if (i8 == 1) {
                                                                    d16VarM21992f = d16Var3;
                                                                } else {
                                                                    if (x66Var3 == null) {
                                                                        x66Var3 = new x66(new d16[16]);
                                                                    }
                                                                    if (d16VarM21992f != null) {
                                                                        x66Var3.m24305c(d16VarM21992f);
                                                                        d16VarM21992f = null;
                                                                    }
                                                                    x66Var3.m24305c(d16Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i8 == 1) {
                                                        }
                                                    }
                                                    d16VarM21992f = te1.m21992f(x66Var3);
                                                }
                                                break;
                                            }
                                            d16VarM21992f = d16VarM21992f.f34842f;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        c0302dM23497h = null;
        LayoutDirection layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutDirection();
        FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1 = new FocusOwnerImpl$focusSearch$1(c0302dM23497h, this, vi3Var);
        if (i == 1 || i == 2) {
            return Boolean.valueOf(AbstractC0304f.m1393m(c0302d2, i, focusOwnerImpl$focusSearch$1));
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return AbstractC0304f.m1398r(i, focusOwnerImpl$focusSearch$1, e28Var, c0302d2);
        }
        if (i == 7) {
            int i9 = la3.f49363a[layoutDirection2.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    gm5.m12750e();
                    return null;
                }
                i2 = 3;
            }
            C0302d c0302dM23497h3 = AbstractC3695vr.m23497h(c0302d2);
            if (c0302dM23497h3 != null) {
                return AbstractC0304f.m1398r(i2, focusOwnerImpl$focusSearch$1, e28Var, c0302dM23497h3);
            }
            return null;
        }
        if (i != 8) {
            ij6.m13967y(o93.m17871a(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        C0302d c0302dM23497h4 = AbstractC3695vr.m23497h(c0302d2);
        if (c0302dM23497h4 == null) {
            c0302d = null;
            break;
        }
        if (!c0302dM23497h4.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var4 = c0302dM23497h4.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(c0302dM23497h4);
        loop5: while (true) {
            if (c0357gM21979L == null) {
                c0302d = null;
                break;
            }
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                while (d16Var4 != null) {
                    if ((d16Var4.f34839c & 1024) != 0) {
                        d16 d16VarM21992f2 = d16Var4;
                        x66 x66Var4 = null;
                        while (d16VarM21992f2 != null) {
                            if (d16VarM21992f2 instanceof C0302d) {
                                C0302d c0302d3 = (C0302d) d16VarM21992f2;
                                if (c0302d3.m1370b1().f67960a) {
                                    c0302d = c0302d3;
                                    break loop5;
                                }
                            } else if ((d16VarM21992f2.f34839c & 1024) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                int i10 = 0;
                                for (d16 d16Var5 = ((fa2) d16VarM21992f2).f38701K; d16Var5 != null; d16Var5 = d16Var5.f34842f) {
                                    if ((d16Var5.f34839c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            d16VarM21992f2 = d16Var5;
                                        } else {
                                            if (x66Var4 == null) {
                                                x66Var4 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f2 != null) {
                                                x66Var4.m24305c(d16VarM21992f2);
                                                d16VarM21992f2 = null;
                                            }
                                            x66Var4.m24305c(d16Var5);
                                        }
                                    }
                                }
                                if (i10 != 1) {
                                    d16VarM21992f2 = te1.m21992f(x66Var4);
                                }
                            }
                            d16VarM21992f2 = te1.m21992f(x66Var4);
                        }
                    }
                    d16Var4 = d16Var4.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var4 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        if (c0302d != null && c0302d != c0302d2) {
            zBooleanValue = ((Boolean) focusOwnerImpl$focusSearch$1.invoke(c0302d)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: h */
    public final C0302d m1362h() {
        C0302d c0302d = this.f3913h;
        if (c0302d == null || !c0302d.f34836I) {
            return null;
        }
        return c0302d;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1363i(final int i, boolean z) {
        C0302d c0302dM1362h = m1362h();
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f3906a;
        if (c0302dM1362h == null || !c0302dM1362h.f3914J || !viewTreeObserverOnGlobalLayoutListenerC0391c.m1726B(i)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f47718a = Boolean.FALSE;
            C0302d c0302dM1362h2 = m1362h();
            Boolean boolM1361g = m1361g(i, viewTreeObserverOnGlobalLayoutListenerC0391c.getEmbeddedViewFocusRect(), new vi3() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    Boolean boolValueOf = Boolean.valueOf(((C0302d) obj).m1375g1(i));
                    ref$ObjectRef.f47718a = boolValueOf;
                    return boolValueOf;
                }
            });
            if (!fa4.m11650l(boolM1361g, Boolean.TRUE) || c0302dM1362h2 == m1362h()) {
                if (boolM1361g != null && ref$ObjectRef.f47718a != null) {
                    if (!boolM1361g.booleanValue() || !((Boolean) ref$ObjectRef.f47718a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && m1358d(i, false, false)) {
                            Boolean boolM1361g2 = m1361g(i, null, new vi3() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p000.vi3
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(((C0302d) obj).m1375g1(i));
                                }
                            });
                            if (boolM1361g2 != null ? boolM1361g2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1364j(final int i) {
        if (!m1358d(i, false, false)) {
            return false;
        }
        Boolean boolM1361g = m1361g(i, null, new vi3() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((C0302d) obj).m1375g1(i));
            }
        });
        boolean zBooleanValue = boolM1361g != null ? boolM1361g.booleanValue() : false;
        if (!zBooleanValue) {
            m1359e();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: k */
    public final void m1365k(C0302d c0302d) {
        C0302d c0302d2 = this.f3913h;
        this.f3913h = c0302d;
        h66 h66Var = this.f3912g;
        Object[] objArr = h66Var.f1293a;
        int i = h66Var.f1294b;
        for (int i2 = 0; i2 < i; i2++) {
            ((t93) objArr[i2]).mo1745a(c0302d2, c0302d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX INFO: renamed from: l */
    public final boolean m1366l(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i;
        long jM4667a = chd.m4667a(keyEvent);
        int iM4668b = chd.m4668b(keyEvent);
        int i2 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i3 = 0;
        boolean z2 = true;
        if (!ahd.m421a(iM4668b, 2)) {
            if (!ahd.m421a(iM4668b, 1)) {
                return true;
            }
            z56 z56Var = this.f3911f;
            if (z56Var == null || !z56Var.m25467a(jM4667a)) {
                return false;
            }
            z56 z56Var2 = this.f3911f;
            if (z56Var2 != null) {
                int iHashCode = Long.hashCode(jM4667a) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int i5 = i4 & 127;
                int i6 = z56Var2.f70950c;
                int i7 = i4 >>> 7;
                loop5: while (true) {
                    int i8 = i7 & i6;
                    long[] jArr2 = z56Var2.f70948a;
                    int i9 = i8 >> 3;
                    int i10 = (i8 & 7) << 3;
                    long j3 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
                    long j4 = (((long) i5) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                        if (z56Var2.f70949b[iNumberOfTrailingZeros] == jM4667a) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i3 += 8;
                    i7 = i8 + i3;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    z56Var2.f70951d--;
                    long[] jArr3 = z56Var2.f70948a;
                    int i11 = z56Var2.f70950c;
                    int i12 = iNumberOfTrailingZeros >> 3;
                    int i13 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i12] & (~(255 << i13))) | (254 << i13);
                    jArr3[i12] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i11) + (i11 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        z56 z56Var3 = this.f3911f;
        if (z56Var3 == null) {
            z56Var3 = new z56(3);
            this.f3911f = z56Var3;
        }
        z56 z56Var4 = z56Var3;
        int iHashCode2 = Long.hashCode(jM4667a) * (-862048943);
        int i14 = iHashCode2 ^ (iHashCode2 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = z56Var4.f70950c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr4 = z56Var4.f70948a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j7 = (jArr4[i20] >>> i21) | ((jArr4[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
            int i22 = i2;
            long j8 = i16;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i18 + (Long.numberOfTrailingZeros(j10) >> 3)) & i17;
                long j11 = j2;
                if (z56Var4.f70949b[iNumberOfTrailingZeros2] == jM4667a) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iM25468b = z56Var4.m25468b(i15);
                if (z56Var4.f70952e != 0 || ((z56Var4.f70948a[iM25468b >> 3] >> ((iM25468b & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i23 = z56Var4.f70950c;
                    if (i23 <= 8 || Long.compareUnsigned(((long) z56Var4.f70951d) * 32, ((long) i23) * 25) > 0) {
                        z = true;
                        j = 128;
                        int iM18109b = om8.m18109b(z56Var4.f70950c);
                        long[] jArr5 = z56Var4.f70948a;
                        long[] jArr6 = z56Var4.f70949b;
                        int i24 = z56Var4.f70950c;
                        z56Var4.m25469c(iM18109b);
                        long[] jArr7 = z56Var4.f70948a;
                        long[] jArr8 = z56Var4.f70949b;
                        int i25 = z56Var4.f70950c;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr5[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i26];
                                int iHashCode3 = Long.hashCode(j13) * i22;
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                jArr = jArr7;
                                int iM25468b2 = z56Var4.m25468b(i27 >>> 7);
                                long j14 = i27 & 127;
                                int i28 = iM25468b2 >> 3;
                                int i29 = (iM25468b2 & 7) << 3;
                                long j15 = (jArr[i28] & (~(255 << i29))) | (j14 << i29);
                                jArr[i28] = j15;
                                jArr[(((iM25468b2 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                                jArr8[iM25468b2] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i26++;
                            jArr7 = jArr;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                    } else {
                        long[] jArr9 = z56Var4.f70948a;
                        int i30 = z56Var4.f70950c;
                        long[] jArr10 = z56Var4.f70949b;
                        int i31 = (i30 + 7) >> 3;
                        int i32 = 0;
                        while (i32 < i31) {
                            long j16 = jArr9[i32] & (-9187201950435737472L);
                            jArr9[i32] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i32++;
                            c = c;
                            i30 = i30;
                        }
                        char c2 = c;
                        int i33 = i30;
                        j = 128;
                        int iM20841i0 = AbstractC3550rv.m20841i0(jArr9);
                        int i34 = iM20841i0 - 1;
                        long j17 = 72057594037927935L;
                        jArr9[i34] = (jArr9[i34] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iM20841i0] = jArr9[0];
                        int i35 = i33;
                        int i36 = 0;
                        while (i36 != i35) {
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            long j18 = (jArr9[i37] >> i38) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i36]) * i22;
                                int i39 = iHashCode4 ^ (iHashCode4 << 16);
                                long j19 = j17;
                                int i40 = i39 >>> 7;
                                int iM25468b3 = z56Var4.m25468b(i40);
                                int i41 = i40 & i35;
                                char c3 = c2;
                                if (((iM25468b3 - i41) & i35) / 8 == ((i36 - i41) & i35) / 8) {
                                    jArr9[i37] = ((~(255 << i38)) & jArr9[i37]) | (((long) (i39 & 127)) << i38);
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36++;
                                } else {
                                    int i42 = iM25468b3 >> 3;
                                    long j20 = jArr9[i42];
                                    int i43 = (iM25468b3 & 7) << 3;
                                    if (((j20 >> i43) & 255) == 128) {
                                        int i44 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (128 << i38);
                                        jArr10[iM25468b3] = jArr10[i44];
                                        jArr10[i44] = j12;
                                        i = i44;
                                    } else {
                                        int i45 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        long j21 = jArr10[iM25468b3];
                                        jArr10[iM25468b3] = jArr10[i45];
                                        jArr10[i45] = j21;
                                        i = i45 - 1;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36 = i + 1;
                                    i35 = i35;
                                }
                                j17 = j19;
                                c2 = c3;
                                z2 = z2;
                            } else {
                                i36++;
                            }
                        }
                        z = z2;
                        z56Var4.f70952e = om8.m18108a(z56Var4.f70950c) - z56Var4.f70951d;
                    }
                    iM25468b = z56Var4.m25468b(i15);
                }
                iNumberOfTrailingZeros2 = iM25468b;
                z56Var4.f70951d++;
                int i46 = z56Var4.f70952e;
                long[] jArr11 = z56Var4.f70948a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                z56Var4.f70952e = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = z56Var4.f70950c;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i2 = i22;
            j2 = j12;
        }
        z56Var4.f70949b[iNumberOfTrailingZeros2] = jM4667a;
        return z;
    }
}
