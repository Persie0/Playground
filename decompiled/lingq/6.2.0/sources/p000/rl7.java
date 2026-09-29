package p000;

import android.content.Context;
import android.os.Handler;
import com.kochava.core.profile.internal.ProfileLoadException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.privacy.consent.internal.ConsentState;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rl7 implements ur9, vr9 {

    /* JADX INFO: renamed from: Q */
    public static final sq5 f59475Q;

    /* JADX INFO: renamed from: R */
    public static final Object f59476R;

    /* JADX INFO: renamed from: H */
    public sl7 f59477H;

    /* JADX INFO: renamed from: I */
    public jm7 f59478I;

    /* JADX INFO: renamed from: J */
    public sl7 f59479J;

    /* JADX INFO: renamed from: K */
    public o67 f59480K;

    /* JADX INFO: renamed from: L */
    public o67 f59481L;

    /* JADX INFO: renamed from: M */
    public o67 f59482M;

    /* JADX INFO: renamed from: N */
    public o67 f59483N;

    /* JADX INFO: renamed from: O */
    public o67 f59484O;

    /* JADX INFO: renamed from: P */
    public o67 f59485P;

    /* JADX INFO: renamed from: a */
    public final Context f59486a;

    /* JADX INFO: renamed from: b */
    public final ny8 f59487b;

    /* JADX INFO: renamed from: c */
    public final Object f59488c = new Object();

    /* JADX INFO: renamed from: d */
    public final Object f59489d = new Object();

    /* JADX INFO: renamed from: e */
    public final CountDownLatch f59490e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    public volatile boolean f59491f = false;

    /* JADX INFO: renamed from: g */
    public volatile dm1 f59492g = null;

    /* JADX INFO: renamed from: h */
    public final long f59493h;

    /* JADX INFO: renamed from: i */
    public em7 f59494i;

    /* JADX INFO: renamed from: j */
    public zl7 f59495j;

    /* JADX INFO: renamed from: k */
    public am7 f59496k;

    /* JADX INFO: renamed from: l */
    public mm7 f59497l;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f59475Q = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "Profile");
        f59476R = new Object();
    }

    public rl7(Context context, ny8 ny8Var, long j) {
        this.f59486a = context;
        this.f59487b = ny8Var;
        this.f59493h = j;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m20687b(p44 p44Var) {
        ArrayList arrayList = new ArrayList();
        if (!p44Var.f55564m.f7959a) {
            arrayList.add(PayloadType.SessionBegin);
            arrayList.add(PayloadType.SessionEnd);
        }
        if (!p44Var.f55562k.f66374a) {
            arrayList.add(PayloadType.PushTokenAdd);
            arrayList.add(PayloadType.PushTokenRemove);
        }
        if (!p44Var.f55557f.f66374a) {
            arrayList.add(PayloadType.Update);
        }
        if (!p44Var.f55552a.f57263b) {
            arrayList.add(PayloadType.GetAttribution);
        }
        return arrayList;
    }

    @Override // p000.vr9
    /* JADX INFO: renamed from: a */
    public final void mo2997a() {
        dm1 dm1Var;
        synchronized (this.f59489d) {
            dm1Var = this.f59492g;
        }
        if (dm1Var != null) {
            dm1Var.m10460b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0215 A[Catch: all -> 0x022b, TryCatch #10 {all -> 0x022b, blocks: (B:4:0x0006, B:5:0x000e, B:7:0x0011, B:8:0x0012, B:10:0x0018, B:14:0x001f, B:15:0x002a, B:17:0x002d, B:18:0x002e, B:19:0x0034, B:32:0x004f, B:33:0x0050, B:36:0x0062, B:37:0x0113, B:39:0x0116, B:40:0x0117, B:41:0x0120, B:43:0x0123, B:44:0x0124, B:46:0x0127, B:47:0x0128, B:48:0x012e, B:50:0x0131, B:51:0x0132, B:53:0x0135, B:54:0x0136, B:55:0x013c, B:57:0x013f, B:58:0x0140, B:60:0x0143, B:61:0x0144, B:62:0x014a, B:64:0x014d, B:65:0x014e, B:67:0x0151, B:68:0x0152, B:69:0x0172, B:71:0x0175, B:72:0x0176, B:76:0x018e, B:77:0x01b1, B:79:0x01b4, B:80:0x01b5, B:81:0x01c5, B:83:0x01c8, B:84:0x01c9, B:86:0x01cc, B:87:0x01cd, B:89:0x01d0, B:90:0x01d1, B:92:0x01d4, B:93:0x01d5, B:94:0x01f2, B:96:0x01f5, B:98:0x01f8, B:100:0x0201, B:102:0x0215, B:103:0x0223, B:105:0x0226, B:116:0x0235, B:117:0x023e, B:109:0x022a, B:112:0x022d, B:113:0x0231, B:115:0x0234, B:121:0x0242, B:99:0x01fc, B:124:0x0245, B:127:0x0248, B:130:0x024b, B:133:0x024e, B:136:0x0251, B:139:0x0254, B:75:0x018a, B:142:0x0257, B:145:0x025a, B:148:0x025d, B:151:0x0260, B:154:0x0263, B:157:0x0266, B:160:0x0269, B:163:0x026c, B:166:0x026f, B:169:0x0272, B:179:0x027c, B:182:0x027f, B:13:0x001d, B:185:0x0282, B:114:0x0232, B:6:0x000f, B:56:0x013d, B:95:0x01f3, B:52:0x0133, B:91:0x01d2, B:49:0x012f, B:104:0x0224, B:88:0x01ce, B:45:0x0125, B:85:0x01ca, B:42:0x0121, B:82:0x01c6, B:38:0x0114, B:78:0x01b2, B:20:0x0035, B:24:0x003f, B:28:0x0045, B:30:0x0048, B:31:0x0049, B:174:0x0277, B:27:0x0044, B:177:0x027a, B:70:0x0173, B:66:0x014f, B:63:0x014b, B:16:0x002b, B:59:0x0141), top: B:208:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13, #14, #15, #16, #17, #19, #21, #22, #23 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x022d A[Catch: all -> 0x022b, TryCatch #10 {all -> 0x022b, blocks: (B:4:0x0006, B:5:0x000e, B:7:0x0011, B:8:0x0012, B:10:0x0018, B:14:0x001f, B:15:0x002a, B:17:0x002d, B:18:0x002e, B:19:0x0034, B:32:0x004f, B:33:0x0050, B:36:0x0062, B:37:0x0113, B:39:0x0116, B:40:0x0117, B:41:0x0120, B:43:0x0123, B:44:0x0124, B:46:0x0127, B:47:0x0128, B:48:0x012e, B:50:0x0131, B:51:0x0132, B:53:0x0135, B:54:0x0136, B:55:0x013c, B:57:0x013f, B:58:0x0140, B:60:0x0143, B:61:0x0144, B:62:0x014a, B:64:0x014d, B:65:0x014e, B:67:0x0151, B:68:0x0152, B:69:0x0172, B:71:0x0175, B:72:0x0176, B:76:0x018e, B:77:0x01b1, B:79:0x01b4, B:80:0x01b5, B:81:0x01c5, B:83:0x01c8, B:84:0x01c9, B:86:0x01cc, B:87:0x01cd, B:89:0x01d0, B:90:0x01d1, B:92:0x01d4, B:93:0x01d5, B:94:0x01f2, B:96:0x01f5, B:98:0x01f8, B:100:0x0201, B:102:0x0215, B:103:0x0223, B:105:0x0226, B:116:0x0235, B:117:0x023e, B:109:0x022a, B:112:0x022d, B:113:0x0231, B:115:0x0234, B:121:0x0242, B:99:0x01fc, B:124:0x0245, B:127:0x0248, B:130:0x024b, B:133:0x024e, B:136:0x0251, B:139:0x0254, B:75:0x018a, B:142:0x0257, B:145:0x025a, B:148:0x025d, B:151:0x0260, B:154:0x0263, B:157:0x0266, B:160:0x0269, B:163:0x026c, B:166:0x026f, B:169:0x0272, B:179:0x027c, B:182:0x027f, B:13:0x001d, B:185:0x0282, B:114:0x0232, B:6:0x000f, B:56:0x013d, B:95:0x01f3, B:52:0x0133, B:91:0x01d2, B:49:0x012f, B:104:0x0224, B:88:0x01ce, B:45:0x0125, B:85:0x01ca, B:42:0x0121, B:82:0x01c6, B:38:0x0114, B:78:0x01b2, B:20:0x0035, B:24:0x003f, B:28:0x0045, B:30:0x0048, B:31:0x0049, B:174:0x0277, B:27:0x0044, B:177:0x027a, B:70:0x0173, B:66:0x014f, B:63:0x014b, B:16:0x002b, B:59:0x0141), top: B:208:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13, #14, #15, #16, #17, #19, #21, #22, #23 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[Catch: all -> 0x022b, TryCatch #10 {all -> 0x022b, blocks: (B:4:0x0006, B:5:0x000e, B:7:0x0011, B:8:0x0012, B:10:0x0018, B:14:0x001f, B:15:0x002a, B:17:0x002d, B:18:0x002e, B:19:0x0034, B:32:0x004f, B:33:0x0050, B:36:0x0062, B:37:0x0113, B:39:0x0116, B:40:0x0117, B:41:0x0120, B:43:0x0123, B:44:0x0124, B:46:0x0127, B:47:0x0128, B:48:0x012e, B:50:0x0131, B:51:0x0132, B:53:0x0135, B:54:0x0136, B:55:0x013c, B:57:0x013f, B:58:0x0140, B:60:0x0143, B:61:0x0144, B:62:0x014a, B:64:0x014d, B:65:0x014e, B:67:0x0151, B:68:0x0152, B:69:0x0172, B:71:0x0175, B:72:0x0176, B:76:0x018e, B:77:0x01b1, B:79:0x01b4, B:80:0x01b5, B:81:0x01c5, B:83:0x01c8, B:84:0x01c9, B:86:0x01cc, B:87:0x01cd, B:89:0x01d0, B:90:0x01d1, B:92:0x01d4, B:93:0x01d5, B:94:0x01f2, B:96:0x01f5, B:98:0x01f8, B:100:0x0201, B:102:0x0215, B:103:0x0223, B:105:0x0226, B:116:0x0235, B:117:0x023e, B:109:0x022a, B:112:0x022d, B:113:0x0231, B:115:0x0234, B:121:0x0242, B:99:0x01fc, B:124:0x0245, B:127:0x0248, B:130:0x024b, B:133:0x024e, B:136:0x0251, B:139:0x0254, B:75:0x018a, B:142:0x0257, B:145:0x025a, B:148:0x025d, B:151:0x0260, B:154:0x0263, B:157:0x0266, B:160:0x0269, B:163:0x026c, B:166:0x026f, B:169:0x0272, B:179:0x027c, B:182:0x027f, B:13:0x001d, B:185:0x0282, B:114:0x0232, B:6:0x000f, B:56:0x013d, B:95:0x01f3, B:52:0x0133, B:91:0x01d2, B:49:0x012f, B:104:0x0224, B:88:0x01ce, B:45:0x0125, B:85:0x01ca, B:42:0x0121, B:82:0x01c6, B:38:0x0114, B:78:0x01b2, B:20:0x0035, B:24:0x003f, B:28:0x0045, B:30:0x0048, B:31:0x0049, B:174:0x0277, B:27:0x0044, B:177:0x027a, B:70:0x0173, B:66:0x014f, B:63:0x014b, B:16:0x002b, B:59:0x0141), top: B:208:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13, #14, #15, #16, #17, #19, #21, #22, #23 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8 A[Catch: all -> 0x022b, TryCatch #10 {all -> 0x022b, blocks: (B:4:0x0006, B:5:0x000e, B:7:0x0011, B:8:0x0012, B:10:0x0018, B:14:0x001f, B:15:0x002a, B:17:0x002d, B:18:0x002e, B:19:0x0034, B:32:0x004f, B:33:0x0050, B:36:0x0062, B:37:0x0113, B:39:0x0116, B:40:0x0117, B:41:0x0120, B:43:0x0123, B:44:0x0124, B:46:0x0127, B:47:0x0128, B:48:0x012e, B:50:0x0131, B:51:0x0132, B:53:0x0135, B:54:0x0136, B:55:0x013c, B:57:0x013f, B:58:0x0140, B:60:0x0143, B:61:0x0144, B:62:0x014a, B:64:0x014d, B:65:0x014e, B:67:0x0151, B:68:0x0152, B:69:0x0172, B:71:0x0175, B:72:0x0176, B:76:0x018e, B:77:0x01b1, B:79:0x01b4, B:80:0x01b5, B:81:0x01c5, B:83:0x01c8, B:84:0x01c9, B:86:0x01cc, B:87:0x01cd, B:89:0x01d0, B:90:0x01d1, B:92:0x01d4, B:93:0x01d5, B:94:0x01f2, B:96:0x01f5, B:98:0x01f8, B:100:0x0201, B:102:0x0215, B:103:0x0223, B:105:0x0226, B:116:0x0235, B:117:0x023e, B:109:0x022a, B:112:0x022d, B:113:0x0231, B:115:0x0234, B:121:0x0242, B:99:0x01fc, B:124:0x0245, B:127:0x0248, B:130:0x024b, B:133:0x024e, B:136:0x0251, B:139:0x0254, B:75:0x018a, B:142:0x0257, B:145:0x025a, B:148:0x025d, B:151:0x0260, B:154:0x0263, B:157:0x0266, B:160:0x0269, B:163:0x026c, B:166:0x026f, B:169:0x0272, B:179:0x027c, B:182:0x027f, B:13:0x001d, B:185:0x0282, B:114:0x0232, B:6:0x000f, B:56:0x013d, B:95:0x01f3, B:52:0x0133, B:91:0x01d2, B:49:0x012f, B:104:0x0224, B:88:0x01ce, B:45:0x0125, B:85:0x01ca, B:42:0x0121, B:82:0x01c6, B:38:0x0114, B:78:0x01b2, B:20:0x0035, B:24:0x003f, B:28:0x0045, B:30:0x0048, B:31:0x0049, B:174:0x0277, B:27:0x0044, B:177:0x027a, B:70:0x0173, B:66:0x014f, B:63:0x014b, B:16:0x002b, B:59:0x0141), top: B:208:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13, #14, #15, #16, #17, #19, #21, #22, #23 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc A[Catch: all -> 0x022b, TryCatch #10 {all -> 0x022b, blocks: (B:4:0x0006, B:5:0x000e, B:7:0x0011, B:8:0x0012, B:10:0x0018, B:14:0x001f, B:15:0x002a, B:17:0x002d, B:18:0x002e, B:19:0x0034, B:32:0x004f, B:33:0x0050, B:36:0x0062, B:37:0x0113, B:39:0x0116, B:40:0x0117, B:41:0x0120, B:43:0x0123, B:44:0x0124, B:46:0x0127, B:47:0x0128, B:48:0x012e, B:50:0x0131, B:51:0x0132, B:53:0x0135, B:54:0x0136, B:55:0x013c, B:57:0x013f, B:58:0x0140, B:60:0x0143, B:61:0x0144, B:62:0x014a, B:64:0x014d, B:65:0x014e, B:67:0x0151, B:68:0x0152, B:69:0x0172, B:71:0x0175, B:72:0x0176, B:76:0x018e, B:77:0x01b1, B:79:0x01b4, B:80:0x01b5, B:81:0x01c5, B:83:0x01c8, B:84:0x01c9, B:86:0x01cc, B:87:0x01cd, B:89:0x01d0, B:90:0x01d1, B:92:0x01d4, B:93:0x01d5, B:94:0x01f2, B:96:0x01f5, B:98:0x01f8, B:100:0x0201, B:102:0x0215, B:103:0x0223, B:105:0x0226, B:116:0x0235, B:117:0x023e, B:109:0x022a, B:112:0x022d, B:113:0x0231, B:115:0x0234, B:121:0x0242, B:99:0x01fc, B:124:0x0245, B:127:0x0248, B:130:0x024b, B:133:0x024e, B:136:0x0251, B:139:0x0254, B:75:0x018a, B:142:0x0257, B:145:0x025a, B:148:0x025d, B:151:0x0260, B:154:0x0263, B:157:0x0266, B:160:0x0269, B:163:0x026c, B:166:0x026f, B:169:0x0272, B:179:0x027c, B:182:0x027f, B:13:0x001d, B:185:0x0282, B:114:0x0232, B:6:0x000f, B:56:0x013d, B:95:0x01f3, B:52:0x0133, B:91:0x01d2, B:49:0x012f, B:104:0x0224, B:88:0x01ce, B:45:0x0125, B:85:0x01ca, B:42:0x0121, B:82:0x01c6, B:38:0x0114, B:78:0x01b2, B:20:0x0035, B:24:0x003f, B:28:0x0045, B:30:0x0048, B:31:0x0049, B:174:0x0277, B:27:0x0044, B:177:0x027a, B:70:0x0173, B:66:0x014f, B:63:0x014b, B:16:0x002b, B:59:0x0141), top: B:208:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13, #14, #15, #16, #17, #19, #21, #22, #23 }] */
    /* JADX INFO: renamed from: c */
    public final void m20688c(d74 d74Var, g02 g02Var, rk7 rk7Var, qq7 qq7Var) {
        String str;
        String str2;
        String str3;
        am7 am7Var;
        d02 d02VarM12256d;
        am7 am7Var2;
        uo3 uo3Var;
        d02 d02VarM12256d2;
        am7 am7Var3;
        hx3 hx3Var;
        d02 d02VarM12256d3;
        am7 am7Var4;
        bl8 bl8Var;
        d02 d02VarM12256d4;
        am7 am7Var5;
        by5 by5Var;
        am7 am7Var6;
        double d;
        long jM4705R;
        am7 am7Var7;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        ConsentState consentStateM14532E;
        jm7 jm7Var;
        long j;
        m67 m67Var;
        e02 e02VarM12257e;
        e02 e02VarM12257e2;
        t44 t44Var;
        m20705u();
        synchronized (f59476R) {
            try {
                p44 p44VarM25692F = this.f59495j.m25692F();
                em7 em7Var = this.f59494i;
                synchronized (em7Var) {
                    str = em7Var.f37465f;
                }
                String str4 = (String) d74Var.f35081e;
                if (str4 == null || !d74Var.f35079c) {
                    str4 = d74Var.f35080d;
                }
                String strM3248o = b34.m3248o(str, str4, new String[0]);
                e02 e02VarM12257e3 = g02Var.m12257e();
                synchronized (e02VarM12257e3) {
                    e02VarM12257e3.f36485c = strM3248o;
                }
                e02 e02VarM12257e4 = g02Var.m12257e();
                em7 em7Var2 = this.f59494i;
                synchronized (em7Var2) {
                    synchronized (em7Var2) {
                        str2 = b34.m3255w(em7Var2.f37467h) ? null : em7Var2.f37467h;
                    }
                    e02VarM12257e4.m10767g(b34.m3248o(str2, em7Var2.f37466g, new String[0]));
                    e02 e02VarM12257e5 = g02Var.m12257e();
                    str3 = p44VarM25692F.f55553b.f58601b;
                    if (b34.m3255w(str3)) {
                        str3 = null;
                    }
                    e02VarM12257e5.m10769i(str3);
                    g02Var.m12257e().m10772l(this.f59496k.m561H());
                    zc2 zc2Var = p44VarM25692F.f55561j;
                    zc2Var.getClass();
                    g02Var.m12262j(new ArrayList(Arrays.asList((String[]) zc2Var.f71351d)));
                    zc2 zc2Var2 = p44VarM25692F.f55561j;
                    zc2Var2.getClass();
                    g02Var.m12261i(new ArrayList(Arrays.asList((String[]) zc2Var2.f71350c)));
                    g02Var.m12268p(m20687b(p44VarM25692F));
                    zc2 zc2Var3 = p44VarM25692F.f55561j;
                    zc2Var3.getClass();
                    g02Var.m12264l(new ArrayList(Arrays.asList((String[]) zc2Var3.f71352e)));
                    zc2 zc2Var4 = p44VarM25692F.f55561j;
                    zc2Var4.getClass();
                    g02Var.m12263k(new ArrayList(Arrays.asList((String[]) zc2Var4.f71353f)), p44VarM25692F.f55561j.f71348a);
                    zc2 zc2Var5 = p44VarM25692F.f55561j;
                    zc2Var5.getClass();
                    g02Var.m12266n(new ArrayList(Arrays.asList((String[]) zc2Var5.f71354g)));
                    g02Var.m12257e().m10777q(this.f59494i.m11226G());
                    g02Var.m12257e().m10774n(this.f59477H.m21447E());
                    g02Var.m12257e().m10768h(this.f59496k.m560G());
                    e02 e02VarM12257e6 = g02Var.m12257e();
                    am7Var = this.f59496k;
                    synchronized (am7Var) {
                        e74 e74Var = am7Var.f832I;
                    }
                    e02VarM12257e6.m10771k(e74Var);
                    d02VarM12256d = g02Var.m12256d();
                    am7Var2 = this.f59496k;
                    synchronized (am7Var2) {
                        uo3Var = am7Var2.f833J;
                    }
                    synchronized (d02VarM12256d) {
                        d02VarM12256d.f34761g = uo3Var;
                    }
                    d02VarM12256d2 = g02Var.m12256d();
                    am7Var3 = this.f59496k;
                    synchronized (am7Var3) {
                        hx3Var = am7Var3.f834K;
                    }
                    synchronized (d02VarM12256d2) {
                        d02VarM12256d2.f34766l = hx3Var;
                    }
                    d02VarM12256d3 = g02Var.m12256d();
                    am7Var4 = this.f59496k;
                    synchronized (am7Var4) {
                        bl8Var = am7Var4.f835L;
                    }
                    synchronized (d02VarM12256d3) {
                        d02VarM12256d3.f34767m = bl8Var;
                    }
                    d02VarM12256d4 = g02Var.m12256d();
                    am7Var5 = this.f59496k;
                    synchronized (am7Var5) {
                        by5Var = am7Var5.f836M;
                    }
                    synchronized (d02VarM12256d4) {
                        d02VarM12256d4.f34771q = by5Var;
                    }
                    g02Var.m12256d().m9959i(this.f59496k.m558E());
                    g02Var.m12257e().m10766f(this.f59496k.m559F());
                    d02 d02VarM12256d5 = g02Var.m12256d();
                    am7Var6 = this.f59496k;
                    synchronized (am7Var6) {
                        boolean z3 = am7Var6.f844i;
                    }
                    d02VarM12256d5.m9958h(Boolean.valueOf(z3));
                    d = p44VarM25692F.f55560i.f69273b;
                    if (d < 0.0d) {
                        jM4705R = -1;
                    } else {
                        jM4705R = ci8.m4705R(d);
                    }
                    qq7Var.m20118b(jM4705R);
                    PayloadType.setInitOverrideUrls(p44VarM25692F.f55560i.f69274c);
                    zc2 zc2Var6 = p44VarM25692F.f55561j;
                    zc2Var6.getClass();
                    rk7Var.m20680d(new ArrayList(Arrays.asList((pk7[]) zc2Var6.f71349b)));
                    am7Var7 = this.f59496k;
                    synchronized (am7Var7) {
                        boolean z4 = am7Var7.f844i;
                    }
                    rk7Var.m20681e("_alat", z4);
                    rk7Var.m20681e("_dlat", g02Var.m12256d().m9957g());
                    synchronized (rk7Var) {
                        arrayList = rk7Var.f59443f;
                    }
                    synchronized (g02Var) {
                        g02Var.f40007n = arrayList;
                    }
                    synchronized (rk7Var) {
                        arrayList2 = rk7Var.f59444g;
                    }
                    synchronized (g02Var) {
                        g02Var.f40008o = arrayList2;
                    }
                    g02Var.m12260h(((w83) p44VarM25692F.f55561j.f71355h).f66511a);
                    w83 w83Var = (w83) p44VarM25692F.f55561j.f71355h;
                    z = w83Var.f66511a;
                    z2 = w83Var.f66512b;
                    consentStateM14532E = this.f59478I.m14532E();
                    jm7Var = this.f59478I;
                    synchronized (jm7Var) {
                        j = jm7Var.f45834d;
                    }
                    if (z) {
                        m67Var = new m67(z2, consentStateM14532E, j);
                    } else {
                        sq5 sq5Var = m67.f50666d;
                        m67Var = null;
                    }
                    g02Var.m12267o(m67Var);
                    rk7Var.m20681e("_gdpr", m20696l());
                    if (this.f59495j.m25694H()) {
                        e02VarM12257e2 = g02Var.m12257e();
                        t44Var = this.f59495j.m25692F().f55554c.f60270d;
                        synchronized (e02VarM12257e2) {
                            e02VarM12257e2.f36499q = t44Var;
                        }
                    } else {
                        e02VarM12257e = g02Var.m12257e();
                        synchronized (e02VarM12257e) {
                            e02VarM12257e.f36499q = null;
                        }
                    }
                    g02Var.m12265m(this.f59495j.m25693G());
                }
                synchronized (em7Var2) {
                }
                e02VarM12257e4.m10767g(b34.m3248o(str2, em7Var2.f37466g, new String[0]));
                e02 e02VarM12257e7 = g02Var.m12257e();
                str3 = p44VarM25692F.f55553b.f58601b;
                if (b34.m3255w(str3)) {
                    str3 = null;
                }
                e02VarM12257e7.m10769i(str3);
                g02Var.m12257e().m10772l(this.f59496k.m561H());
                zc2 zc2Var7 = p44VarM25692F.f55561j;
                zc2Var7.getClass();
                g02Var.m12262j(new ArrayList(Arrays.asList((String[]) zc2Var7.f71351d)));
                zc2 zc2Var8 = p44VarM25692F.f55561j;
                zc2Var8.getClass();
                g02Var.m12261i(new ArrayList(Arrays.asList((String[]) zc2Var8.f71350c)));
                g02Var.m12268p(m20687b(p44VarM25692F));
                zc2 zc2Var9 = p44VarM25692F.f55561j;
                zc2Var9.getClass();
                g02Var.m12264l(new ArrayList(Arrays.asList((String[]) zc2Var9.f71352e)));
                zc2 zc2Var10 = p44VarM25692F.f55561j;
                zc2Var10.getClass();
                g02Var.m12263k(new ArrayList(Arrays.asList((String[]) zc2Var10.f71353f)), p44VarM25692F.f55561j.f71348a);
                zc2 zc2Var11 = p44VarM25692F.f55561j;
                zc2Var11.getClass();
                g02Var.m12266n(new ArrayList(Arrays.asList((String[]) zc2Var11.f71354g)));
                g02Var.m12257e().m10777q(this.f59494i.m11226G());
                g02Var.m12257e().m10774n(this.f59477H.m21447E());
                g02Var.m12257e().m10768h(this.f59496k.m560G());
                e02 e02VarM12257e8 = g02Var.m12257e();
                am7Var = this.f59496k;
                synchronized (am7Var) {
                    e74 e74Var2 = am7Var.f832I;
                    e02VarM12257e8.m10771k(e74Var2);
                    d02VarM12256d = g02Var.m12256d();
                    am7Var2 = this.f59496k;
                    synchronized (am7Var2) {
                        uo3Var = am7Var2.f833J;
                        synchronized (d02VarM12256d) {
                            d02VarM12256d.f34761g = uo3Var;
                            d02VarM12256d2 = g02Var.m12256d();
                            am7Var3 = this.f59496k;
                            synchronized (am7Var3) {
                                hx3Var = am7Var3.f834K;
                                synchronized (d02VarM12256d2) {
                                    d02VarM12256d2.f34766l = hx3Var;
                                    d02VarM12256d3 = g02Var.m12256d();
                                    am7Var4 = this.f59496k;
                                    synchronized (am7Var4) {
                                        bl8Var = am7Var4.f835L;
                                        synchronized (d02VarM12256d3) {
                                            d02VarM12256d3.f34767m = bl8Var;
                                            d02VarM12256d4 = g02Var.m12256d();
                                            am7Var5 = this.f59496k;
                                            synchronized (am7Var5) {
                                                by5Var = am7Var5.f836M;
                                                synchronized (d02VarM12256d4) {
                                                    d02VarM12256d4.f34771q = by5Var;
                                                    g02Var.m12256d().m9959i(this.f59496k.m558E());
                                                    g02Var.m12257e().m10766f(this.f59496k.m559F());
                                                    d02 d02VarM12256d6 = g02Var.m12256d();
                                                    am7Var6 = this.f59496k;
                                                    synchronized (am7Var6) {
                                                        boolean z5 = am7Var6.f844i;
                                                        d02VarM12256d6.m9958h(Boolean.valueOf(z5));
                                                        d = p44VarM25692F.f55560i.f69273b;
                                                        if (d < 0.0d) {
                                                            jM4705R = -1;
                                                        } else {
                                                            jM4705R = ci8.m4705R(d);
                                                        }
                                                        qq7Var.m20118b(jM4705R);
                                                        PayloadType.setInitOverrideUrls(p44VarM25692F.f55560i.f69274c);
                                                        zc2 zc2Var12 = p44VarM25692F.f55561j;
                                                        zc2Var12.getClass();
                                                        rk7Var.m20680d(new ArrayList(Arrays.asList((pk7[]) zc2Var12.f71349b)));
                                                        am7Var7 = this.f59496k;
                                                        synchronized (am7Var7) {
                                                            boolean z6 = am7Var7.f844i;
                                                            rk7Var.m20681e("_alat", z6);
                                                            rk7Var.m20681e("_dlat", g02Var.m12256d().m9957g());
                                                            synchronized (rk7Var) {
                                                                arrayList = rk7Var.f59443f;
                                                                synchronized (g02Var) {
                                                                    g02Var.f40007n = arrayList;
                                                                    synchronized (rk7Var) {
                                                                        arrayList2 = rk7Var.f59444g;
                                                                        synchronized (g02Var) {
                                                                            g02Var.f40008o = arrayList2;
                                                                            g02Var.m12260h(((w83) p44VarM25692F.f55561j.f71355h).f66511a);
                                                                            w83 w83Var2 = (w83) p44VarM25692F.f55561j.f71355h;
                                                                            z = w83Var2.f66511a;
                                                                            z2 = w83Var2.f66512b;
                                                                            consentStateM14532E = this.f59478I.m14532E();
                                                                            jm7Var = this.f59478I;
                                                                            synchronized (jm7Var) {
                                                                                j = jm7Var.f45834d;
                                                                                if (z) {
                                                                                    sq5 sq5Var2 = m67.f50666d;
                                                                                    m67Var = null;
                                                                                } else {
                                                                                    m67Var = new m67(z2, consentStateM14532E, j);
                                                                                }
                                                                                g02Var.m12267o(m67Var);
                                                                                rk7Var.m20681e("_gdpr", m20696l());
                                                                                if (this.f59495j.m25694H()) {
                                                                                    e02VarM12257e2 = g02Var.m12257e();
                                                                                    t44Var = this.f59495j.m25692F().f55554c.f60270d;
                                                                                    synchronized (e02VarM12257e2) {
                                                                                        e02VarM12257e2.f36499q = t44Var;
                                                                                    }
                                                                                } else {
                                                                                    e02VarM12257e = g02Var.m12257e();
                                                                                    synchronized (e02VarM12257e) {
                                                                                        e02VarM12257e.f36499q = null;
                                                                                    }
                                                                                }
                                                                                g02Var.m12265m(this.f59495j.m25693G());
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ur9
    /* JADX INFO: renamed from: d */
    public final void mo4379d() {
        synchronized (this.f59488c) {
            m20698n();
        }
        synchronized (this.f59489d) {
            this.f59490e.countDown();
        }
    }

    /* JADX INFO: renamed from: e */
    public final o67 m20689e() {
        o67 o67Var;
        m20705u();
        synchronized (f59476R) {
            o67Var = this.f59485P;
        }
        return o67Var;
    }

    /* JADX INFO: renamed from: f */
    public final sl7 m20690f() {
        sl7 sl7Var;
        m20705u();
        synchronized (f59476R) {
            sl7Var = this.f59477H;
        }
        return sl7Var;
    }

    /* JADX INFO: renamed from: g */
    public final o67 m20691g() {
        o67 o67Var;
        m20705u();
        synchronized (f59476R) {
            o67Var = this.f59480K;
        }
        return o67Var;
    }

    /* JADX INFO: renamed from: h */
    public final o67 m20692h() {
        o67 o67Var;
        m20705u();
        synchronized (f59476R) {
            o67Var = this.f59482M;
        }
        return o67Var;
    }

    /* JADX INFO: renamed from: i */
    public final zl7 m20693i() {
        zl7 zl7Var;
        m20705u();
        synchronized (f59476R) {
            zl7Var = this.f59495j;
        }
        return zl7Var;
    }

    /* JADX INFO: renamed from: j */
    public final am7 m20694j() {
        am7 am7Var;
        m20705u();
        synchronized (f59476R) {
            am7Var = this.f59496k;
        }
        return am7Var;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20695k() {
        boolean z;
        m20705u();
        synchronized (f59476R) {
            boolean z2 = ((w83) this.f59495j.m25692F().f55561j.f71355h).f66511a;
            boolean z3 = ((w83) this.f59495j.m25692F().f55561j.f71355h).f66512b;
            z = false;
            boolean z4 = this.f59478I.m14532E() == ConsentState.DECLINED;
            if (z2 && z3 && z4) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m20696l() {
        boolean z;
        m20705u();
        synchronized (f59476R) {
            boolean z2 = ((w83) this.f59495j.m25692F().f55561j.f71355h).f66511a;
            boolean z3 = ((w83) this.f59495j.m25692F().f55561j.f71355h).f66512b;
            z = false;
            boolean z4 = this.f59478I.m14532E() == ConsentState.DECLINED;
            boolean z5 = this.f59478I.m14532E() == ConsentState.NOT_ANSWERED;
            if (z2 && z3 && (z4 || z5)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final void m20697m(dm1 dm1Var) {
        synchronized (this.f59489d) {
            try {
                if (this.f59491f) {
                    return;
                }
                this.f59491f = true;
                this.f59492g = dm1Var;
                ny8 ny8Var = this.f59487b;
                TaskQueue taskQueue = TaskQueue.IO;
                sq5 sq5Var = new sq5(this);
                b64 b64Var = (b64) ny8Var.f53415c;
                Handler handler = (Handler) b64Var.f8007b;
                Handler handler2 = (Handler) b64Var.f8006a;
                ExecutorService executorService = b64.f8005f;
                if (executorService != null) {
                    new tr9(handler, handler2, executorService, taskQueue, ny8Var, sq5Var, this).m22280e(0L);
                } else {
                    ho2.m13385e("Failed to start threadpool");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m20698n() {
        boolean z;
        cj9 cj9Var = new cj9(this.f59486a.getSharedPreferences(BuildConfig.PROFILE_NAME, 0), this.f59487b);
        o67 o67Var = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_EVENTS_QUEUE_NAME);
        o67 o67Var2 = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_UPDATES_QUEUE_NAME);
        o67 o67Var3 = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_IDENTITYLINK_QUEUE_NAME);
        o67 o67Var4 = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_TOKEN_QUEUE_NAME);
        o67 o67Var5 = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_SESSION_QUEUE_NAME);
        o67 o67Var6 = new o67(this.f59486a, this.f59487b, BuildConfig.PROFILE_CLICKS_QUEUE_NAME);
        long j = this.f59493h;
        this.f59494i = new em7(cj9Var, j);
        this.f59495j = new zl7(cj9Var, j);
        am7 am7Var = new am7(cj9Var);
        am7Var.f837b = null;
        am7Var.f838c = new e32();
        am7Var.f839d = 0L;
        am7Var.f840e = 0L;
        am7Var.f841f = false;
        am7Var.f842g = false;
        am7Var.f843h = dg4.m10328c();
        am7Var.f844i = false;
        am7Var.f845j = 0L;
        am7Var.f846k = dg4.m10328c();
        am7Var.f847l = dg4.m10328c();
        am7Var.f831H = dg4.m10328c();
        dg4.m10328c();
        am7Var.f832I = null;
        am7Var.f833J = null;
        am7Var.f834K = null;
        am7Var.f835L = null;
        am7Var.f836M = null;
        this.f59496k = am7Var;
        mm7 mm7Var = new mm7(cj9Var);
        mm7Var.f51526b = null;
        mm7Var.f51527c = 0L;
        mm7Var.f51528d = 0L;
        mm7Var.f51529e = false;
        mm7Var.f51530f = 0L;
        mm7Var.f51531g = 0;
        this.f59497l = mm7Var;
        sl7 sl7Var = new sl7(cj9Var);
        dg4.m10328c();
        sl7Var.f60980b = null;
        ef4.m11088d();
        this.f59477H = sl7Var;
        this.f59478I = new jm7(cj9Var, this.f59493h);
        sl7 sl7Var2 = new sl7(cj9Var);
        sl7Var2.f60980b = dg4.m10328c();
        this.f59479J = sl7Var2;
        synchronized (f59476R) {
            try {
                this.f59480K = o67Var;
                this.f59481L = o67Var2;
                this.f59482M = o67Var3;
                this.f59483N = o67Var4;
                this.f59484O = o67Var5;
                this.f59485P = o67Var6;
                this.f59494i.m11227H();
                this.f59495j.m25695I();
                this.f59496k.m563J();
                this.f59497l.m16919E();
                this.f59477H.m21448F();
                this.f59478I.m14533F();
                sl7 sl7Var3 = this.f59479J;
                synchronized (sl7Var3) {
                    sl7Var3.f60980b = ((cj9) sl7Var3.f60774a).m4775c("event.default_parameters", true);
                }
                em7 em7Var = this.f59494i;
                synchronized (em7Var) {
                    z = em7Var.f37463d <= 1;
                }
                if (z) {
                    im7.m14017b(this.f59486a, this.f59493h, this.f59494i, this.f59496k, this.f59477H);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final em7 m20699o() {
        em7 em7Var;
        m20705u();
        synchronized (f59476R) {
            em7Var = this.f59494i;
        }
        return em7Var;
    }

    /* JADX INFO: renamed from: p */
    public final jm7 m20700p() {
        jm7 jm7Var;
        m20705u();
        synchronized (f59476R) {
            jm7Var = this.f59478I;
        }
        return jm7Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m20701q() {
        long j;
        uo3 uo3Var;
        hx3 hx3Var;
        bl8 bl8Var;
        by5 by5Var;
        m20705u();
        synchronized (f59476R) {
            try {
                sq5 sq5Var = f59475Q;
                ((sj5) sq5Var.f61249c).m21420a(3, "Resetting the install such that it will be sent again", (String) sq5Var.f61248b, (String) sq5Var.f61250d);
                Context context = this.f59486a;
                try {
                    j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                } catch (Throwable unused) {
                    j = 0;
                }
                this.f59496k.m572S(0L);
                this.f59496k.m568O(null);
                this.f59496k.m571R(false);
                am7 am7Var = this.f59496k;
                dg4 dg4VarM10328c = dg4.m10328c();
                synchronized (am7Var) {
                    cj9 cj9Var = (cj9) am7Var.f60774a;
                    dg4 dg4VarM10328c2 = dg4.m10328c();
                    dg4VarM10328c2.m10356z("raw", dg4VarM10328c);
                    dg4VarM10328c2.m10330A("retrieved_time_millis", 0L);
                    dg4VarM10328c2.m10331B("device_id", "");
                    dg4VarM10328c2.m10351u("first_install", false);
                    cj9Var.m4781i("install.attribution", dg4VarM10328c2);
                }
                this.f59481L.m17826f();
                this.f59496k.m573T(dg4.m10328c());
                am7 am7Var2 = this.f59496k;
                synchronized (am7Var2) {
                    am7Var2.f842g = false;
                    ((cj9) am7Var2.f60774a).m4779g("install.update_watchlist_initialized", false);
                }
                this.f59482M.m17826f();
                am7 am7Var3 = this.f59496k;
                synchronized (am7Var3) {
                    uo3Var = am7Var3.f833J;
                }
                if (uo3Var != null) {
                    if (uo3Var.f64130d == GoogleReferrerStatus.Ok) {
                        long j2 = uo3Var.f64127a;
                        if (j2 > 0 && j2 < j) {
                            this.f59496k.m564K(null);
                        }
                        throw th;
                    }
                    this.f59496k.m564K(null);
                }
                am7 am7Var4 = this.f59496k;
                synchronized (am7Var4) {
                    hx3Var = am7Var4.f834K;
                }
                if (hx3Var != null) {
                    gx3 gx3Var = (gx3) hx3Var;
                    if (!gx3Var.m12962f() || (gx3Var.m12959c() > 0 && gx3Var.m12959c() < j)) {
                        this.f59496k.m565L(null);
                    }
                }
                am7 am7Var5 = this.f59496k;
                synchronized (am7Var5) {
                    bl8Var = am7Var5.f835L;
                }
                if (bl8Var != null) {
                    al8 al8Var = (al8) bl8Var;
                    if (!al8Var.m545f() || (al8Var.m542c() > 0 && al8Var.m542c() < j)) {
                        this.f59496k.m569P(null);
                    }
                }
                am7 am7Var6 = this.f59496k;
                synchronized (am7Var6) {
                    by5Var = am7Var6.f836M;
                }
                if (by5Var != null) {
                    ay5 ay5Var = (ay5) by5Var;
                    if (!ay5Var.m3124e() || (ay5Var.m3123d() > 0 && ay5Var.m3123d() < j)) {
                        this.f59496k.m567N(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final mm7 m20702r() {
        mm7 mm7Var;
        m20705u();
        synchronized (f59476R) {
            mm7Var = this.f59497l;
        }
        return mm7Var;
    }

    /* JADX INFO: renamed from: s */
    public final o67 m20703s() {
        o67 o67Var;
        m20705u();
        synchronized (f59476R) {
            o67Var = this.f59484O;
        }
        return o67Var;
    }

    /* JADX INFO: renamed from: t */
    public final o67 m20704t() {
        o67 o67Var;
        m20705u();
        synchronized (f59476R) {
            o67Var = this.f59481L;
        }
        return o67Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m20705u() {
        boolean z;
        synchronized (this.f59489d) {
            z = this.f59490e.getCount() == 0;
        }
        if (z) {
            return;
        }
        synchronized (this.f59489d) {
            if (!this.f59491f) {
                throw new ProfileLoadException("Failed to load persisted profile. attempted access before loading.");
            }
        }
        try {
            if (this.f59490e.await(5000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new ProfileLoadException("Failed to load persisted profile, timed out.");
            }
        } catch (InterruptedException e) {
            throw new ProfileLoadException(e);
        }
    }
}
