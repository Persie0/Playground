package p000;

import android.os.Handler;
import android.os.Trace;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frx implements ftb, fto, ftp {

    /* JADX INFO: renamed from: B */
    private final boolean f23372B;

    /* JADX INFO: renamed from: C */
    private final boolean f23373C;

    /* JADX INFO: renamed from: D */
    private boolean f23374D;

    /* JADX INFO: renamed from: E */
    private boolean f23375E;

    /* JADX INFO: renamed from: F */
    private final gkz f23376F;

    /* JADX INFO: renamed from: a */
    public final fky f23377a;

    /* JADX INFO: renamed from: b */
    public final kbo f23378b;

    /* JADX INFO: renamed from: h */
    public final Handler f23384h;

    /* JADX INFO: renamed from: i */
    private final ftd f23385i;

    /* JADX INFO: renamed from: j */
    private final fpy f23386j;

    /* JADX INFO: renamed from: k */
    private final fsd f23387k;

    /* JADX INFO: renamed from: l */
    private final fsd f23388l;

    /* JADX INFO: renamed from: m */
    private final ohb f23389m;

    /* JADX INFO: renamed from: n */
    private final oju f23390n;

    /* JADX INFO: renamed from: o */
    private final fti f23391o;

    /* JADX INFO: renamed from: p */
    private final ftm f23392p;

    /* JADX INFO: renamed from: q */
    private final dhv f23393q;

    /* JADX INFO: renamed from: r */
    private final gta f23394r;

    /* JADX INFO: renamed from: s */
    private final fqi f23395s;

    /* JADX INFO: renamed from: t */
    private boolean f23396t;

    /* JADX INFO: renamed from: w */
    private ftf f23399w;

    /* JADX INFO: renamed from: x */
    private fua f23400x;

    /* JADX INFO: renamed from: c */
    public boolean f23379c = false;

    /* JADX INFO: renamed from: d */
    public final Deque f23380d = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: e */
    public final Deque f23381e = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: u */
    private boolean f23397u = false;

    /* JADX INFO: renamed from: v */
    private boolean f23398v = false;

    /* JADX INFO: renamed from: f */
    public final Set f23382f = new HashSet();

    /* JADX INFO: renamed from: y */
    private gyw f23401y = gyw.UNKNOWN;

    /* JADX INFO: renamed from: g */
    public int f23383g = 0;

    /* JADX INFO: renamed from: z */
    private final Deque f23402z = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: A */
    private float f23371A = 0.0f;

    public frx(ftd ftdVar, fpy fpyVar, fsd fsdVar, fsd fsdVar2, ohb ohbVar, oju ojuVar, fky fkyVar, fti ftiVar, ftm ftmVar, dhv dhvVar, gkz gkzVar, kbo kboVar, Handler handler, gta gtaVar, fqi fqiVar, byte[] bArr, byte[] bArr2) {
        boolean z;
        this.f23385i = ftdVar;
        this.f23386j = fpyVar;
        this.f23387k = fsdVar;
        this.f23388l = fsdVar2;
        this.f23389m = ohbVar;
        this.f23390n = ojuVar;
        this.f23377a = fkyVar;
        this.f23391o = ftiVar;
        this.f23392p = ftmVar;
        this.f23393q = dhvVar;
        this.f23376F = gkzVar;
        this.f23378b = kboVar.mo6314a("MomentsMainLoop");
        this.f23384h = handler;
        this.f23394r = gtaVar;
        if (dhvVar.mo6184l(dij.f11552B) && dhvVar.mo6184l(dij.f11553C)) {
            z = true;
        } else {
            z = dhvVar.mo6184l(dij.f11554D) && dhvVar.mo6184l(dij.f11555E);
        }
        this.f23372B = z;
        this.f23373C = dhvVar.mo6184l(dij.f11556F) && dhvVar.mo6184l(dij.f11557G);
        dhvVar.mo6175c();
        this.f23396t = false;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
        this.f23395s = fqiVar;
    }

    /* JADX INFO: renamed from: s */
    private final int m8725s(long j, boolean z) {
        if (!z) {
            return this.f23385i.f23545b;
        }
        ftd ftdVar = this.f23385i;
        int i = (int) (j / ftdVar.f23546c);
        int i2 = ftdVar.f23545b;
        return Math.min(Math.max(i, i2), ftdVar.f23544a);
    }

    /* JADX INFO: renamed from: t */
    private final long m8726t(frt frtVar) {
        long jM8535a = this.f23377a.m8535a();
        long jLongValue = frtVar.f23351c.m17183l() ? ((Long) frtVar.f23351c.m17180i()).longValue() : jM8535a;
        if (frtVar.f23351c.m17184m()) {
            jM8535a = ((Long) frtVar.f23351c.m17181j()).longValue();
        }
        return TimeUnit.MILLISECONDS.convert(jM8535a - jLongValue, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: u */
    private final frw m8727u(frt frtVar, List list) {
        frw frwVar = new frw();
        for (frs frsVar : this.f23381e) {
            if (frtVar.f23351c.m17185n(frsVar.mo8722c())) {
                if (frsVar.m8723d()) {
                    frwVar.f23369g++;
                } else if (frsVar.f23347a) {
                    frwVar.f23363a++;
                } else if (frsVar.f23348b.mo16813g()) {
                    frwVar.f23368f++;
                } else {
                    frwVar.f23370h++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fpx fpxVar = (fpx) it.next();
            if (!frtVar.f23351c.mo8324a(Long.valueOf(fpxVar.mo8670c()))) {
                frwVar.f23366d++;
            } else if (m8730x(fpxVar)) {
                frwVar.f23367e++;
            } else if (this.f23372B && !this.f23396t && ((this.f23375E || this.f23374D) && !MomentsUtils.m4211c(fpxVar, this.f23371A, this.f23394r, this.f23402z))) {
                frwVar.f23365c++;
            } else if (this.f23373C && this.f23396t && !MomentsUtils.m4210b(fpxVar, this.f23394r, this.f23402z)) {
                frwVar.f23365c++;
            } else {
                frwVar.f23364b++;
            }
        }
        return frwVar;
    }

    /* JADX INFO: renamed from: v */
    private static mrm m8728v(mrm mrmVar, long j) {
        return (!mrmVar.mo16813g() || (mrmVar.mo16813g() && ((Long) mrmVar.mo16809c()).longValue() > j)) ? mrm.m16829i(Long.valueOf(j)) : mrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0272 A[Catch: all -> 0x08e9, PHI: r5
      0x0272: PHI (r5v12 fpx) = (r5v5 fpx), (r5v9 fpx), (r5v23 fpx), (r5v5 fpx) binds: [B:93:0x023b, B:105:0x026e, B:90:0x022e, B:83:0x020e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0280 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02e6 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:118:0x02eb A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ef A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x030a A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0316 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0332  */
    /* JADX WARN: Code duplicated, block: B:129:0x0335  */
    /* JADX WARN: Code duplicated, block: B:133:0x0344 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0349  */
    /* JADX WARN: Code duplicated, block: B:137:0x034e A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0363 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0367 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0375 A[Catch: all -> 0x08e9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x005c, B:15:0x0060, B:146:0x03c8, B:147:0x03d9, B:149:0x03df, B:151:0x03fd, B:153:0x040c, B:155:0x0420, B:156:0x0428, B:158:0x042c, B:170:0x04f2, B:171:0x0500, B:173:0x0506, B:175:0x0518, B:177:0x054c, B:178:0x0554, B:180:0x055c, B:181:0x0571, B:184:0x058e, B:186:0x0596, B:188:0x059c, B:190:0x05b4, B:191:0x05e7, B:192:0x060f, B:194:0x0615, B:196:0x06a1, B:197:0x06b8, B:198:0x06c1, B:159:0x0469, B:161:0x0479, B:163:0x047d, B:164:0x049a, B:166:0x04d4, B:168:0x04e2, B:169:0x04eb, B:199:0x06fc, B:200:0x0712, B:202:0x0718, B:204:0x0722, B:205:0x0728, B:207:0x072e, B:210:0x0741, B:212:0x0757, B:213:0x075b, B:215:0x0762, B:217:0x0770, B:219:0x07a8, B:218:0x07a1, B:220:0x07ab, B:221:0x07bb, B:223:0x07c1, B:225:0x07cb, B:227:0x07d1, B:229:0x07db, B:230:0x07e5, B:231:0x07e8, B:232:0x07f5, B:234:0x07fb, B:236:0x0809, B:238:0x0817, B:240:0x0823, B:242:0x0831, B:243:0x0836, B:247:0x0849, B:249:0x0869, B:251:0x087c, B:250:0x0875, B:252:0x0886, B:254:0x088e, B:256:0x0896, B:258:0x089a, B:260:0x089e, B:263:0x08a9, B:262:0x08a2, B:264:0x08ae, B:265:0x08b4, B:267:0x08ba, B:269:0x08c8, B:271:0x08cc, B:17:0x0064, B:21:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0086, B:29:0x008e, B:30:0x0091, B:33:0x0097, B:35:0x00a5, B:37:0x00bf, B:38:0x00c6, B:39:0x00d5, B:41:0x00db, B:42:0x00f3, B:44:0x00f9, B:46:0x0107, B:65:0x0181, B:49:0x010f, B:50:0x0116, B:52:0x011c, B:54:0x0132, B:56:0x0138, B:58:0x013c, B:60:0x0144, B:62:0x014c, B:64:0x015a, B:68:0x01a3, B:70:0x01af, B:72:0x01bb, B:74:0x01e5, B:73:0x01d2, B:75:0x01e8, B:77:0x01f3, B:78:0x01fc, B:80:0x0208, B:82:0x020c, B:107:0x0272, B:109:0x027c, B:111:0x0280, B:112:0x02ba, B:113:0x02c3, B:115:0x02e6, B:120:0x02ef, B:121:0x02f8, B:122:0x0304, B:124:0x030a, B:126:0x0316, B:133:0x0344, B:135:0x034a, B:137:0x034e, B:139:0x0358, B:142:0x0367, B:144:0x037f, B:143:0x0375, B:140:0x0363, B:118:0x02eb, B:84:0x0210, B:86:0x0217, B:91:0x0230, B:92:0x0239, B:94:0x023d, B:96:0x0244, B:98:0x0254, B:103:0x026a, B:100:0x025e, B:145:0x03c1), top: B:282:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:365:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x0280, please report this as an issue */
    /* JADX INFO: renamed from: w */
    private final synchronized void m8729w() {
        key keyVarMo8787a;
        long j;
        frs frsVar;
        fru fruVarM8720a;
        fua fuaVar;
        gzl gzlVarM7065a;
        npk npkVar;
        int i;
        boolean z;
        long jAbs;
        Iterator it;
        long j2;
        ArrayList arrayList = new ArrayList();
        for (frt frtVar : this.f23380d) {
            if (this.f23382f.contains(frtVar.f23349a)) {
                arrayList.add(frtVar);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            frt frtVar2 = (frt) arrayList.get(i2);
            this.f23378b.mo13940b("track " + String.valueOf(frtVar2.f23349a) + " is not HDR+; cancelling");
            m8732b(frtVar2);
        }
        if (this.f23397u || this.f23398v) {
            ftf ftfVar = this.f23399w;
            fua fuaVar2 = this.f23400x;
            if (ftfVar == null || fuaVar2 == null) {
                this.f23378b.mo13940b("not launching new shots as most recent shot buffers are not available");
            } else {
                int i3 = 0;
                boolean z2 = false;
                for (frs frsVar2 : this.f23381e) {
                    if (frsVar2.f23347a) {
                        if (frsVar2.m8723d()) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    }
                }
                while (true) {
                    if (!this.f23398v && (z2 || i3 >= ((fth) this.f23389m.get()).mo8694a())) {
                        break;
                    }
                    this.f23378b.mo13940b("trying to add shots; currently in flight: " + i3);
                    if (this.f23398v) {
                        this.f23378b.mo13940b("... but ignoring counts since this is our last chance before shutdown");
                    }
                    List listMo8679c = this.f23386j.mo8679c();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = listMo8679c.iterator();
                    while (it2.hasNext()) {
                        fpx fpxVar = (fpx) it2.next();
                        Long lValueOf = Long.valueOf(fpxVar.mo8670c());
                        mzj mzjVarM17175e = mzj.m17175e(lValueOf, lValueOf);
                        for (frt frtVar3 : this.f23380d) {
                            if (frtVar3.f23351c.m17185n(mzjVarM17175e)) {
                                if (frtVar3.f23353e) {
                                    it = it2;
                                } else {
                                    int i4 = 0;
                                    for (frs frsVar3 : this.f23381e) {
                                        it2 = it2;
                                        if (frtVar3.f23351c.m17185n(frsVar3.mo8722c()) && frsVar3.mo8724e() && (frsVar3.f23347a || frsVar3.f23348b.mo16813g())) {
                                            i4++;
                                        }
                                    }
                                    it = it2;
                                    int iM8725s = m8725s(m8726t(frtVar3), frtVar3.f23353e);
                                    if (i4 >= iM8725s) {
                                        this.f23378b.mo13940b("Cannot launch alternative as we have already exceeded the max (" + i4 + " of " + iM8725s + ")");
                                        it2 = it;
                                    }
                                }
                                arrayList2.add(fpxVar);
                                this.f23378b.mo13940b("found relevant burst! ".concat(String.valueOf(String.valueOf(fpxVar))));
                                it2 = it;
                                break;
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        fpx fpxVar2 = (fpx) arrayList2.get(i5);
                        if (m8730x(fpxVar2)) {
                            this.f23378b.mo13940b("burst already processing (or failed): ".concat(String.valueOf(String.valueOf(fpxVar2))));
                        } else {
                            this.f23378b.mo13940b("not yet created: ".concat(String.valueOf(String.valueOf(fpxVar2))));
                            arrayList3.add(fpxVar2);
                        }
                    }
                    Collections.sort(arrayList3, amx.f746j);
                    if (arrayList3.isEmpty()) {
                        this.f23378b.mo13946h("Ran out of alternatives to launch.");
                        break;
                    }
                    fpx fpxVar3 = (fpx) arrayList3.get(0);
                    if (this.f23396t) {
                        if (this.f23373C) {
                            int size3 = arrayList3.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    fpxVar3 = null;
                                    break;
                                }
                                fpx fpxVar4 = (fpx) arrayList3.get(i6);
                                if ((fpxVar4.mo8672e().mo16813g() || fpxVar4.mo8673f().mo16813g()) && MomentsUtils.m4210b(fpxVar4, this.f23394r, this.f23402z)) {
                                    fpxVar3 = fpxVar4;
                                    break;
                                }
                                i6++;
                            }
                            if (fpxVar3 == null) {
                                break;
                            }
                            keyVarMo8787a = ftfVar.mo8787a(fpxVar3.mo8670c());
                            if (keyVarMo8787a == null) {
                                kfd kfdVarMo7041b = keyVarMo8787a.mo7041b();
                                kfdVarMo7041b.getClass();
                                long j3 = kfdVarMo7041b.f35811b;
                                this.f23378b.mo13940b("adding launch frame " + j3);
                                if (this.f23396t) {
                                    if (this.f23373C) {
                                        this.f23402z.add(fpxVar3.mo8671d());
                                    }
                                } else if (this.f23372B) {
                                    this.f23402z.add(fpxVar3.mo8671d());
                                }
                                j = Long.MAX_VALUE;
                                frsVar = null;
                                for (frs frsVar4 : this.f23381e) {
                                    if (frsVar4.m8723d()) {
                                        long j4 = frsVar4.m8720a().f23356d;
                                        kfd kfdVarMo7041b2 = keyVarMo8787a.mo7041b();
                                        kfdVarMo7041b2.getClass();
                                        i = i3;
                                        z = z2;
                                        jAbs = Math.abs(j4 - kfdVarMo7041b2.f35811b);
                                        if (jAbs < j) {
                                            j = jAbs;
                                            frsVar = frsVar4;
                                        }
                                    } else {
                                        i = i3;
                                        z = z2;
                                    }
                                    z2 = z;
                                    i3 = i;
                                }
                                int i7 = i3;
                                boolean z3 = z2;
                                if (frsVar != null) {
                                    fruVarM8720a = frsVar.m8720a();
                                } else {
                                    fruVarM8720a = null;
                                }
                                fuaVar = this.f23400x;
                                if (fuaVar == null) {
                                    gzlVarM7065a = gzl.OFF;
                                } else {
                                    gzlVarM7065a = gzl.OFF;
                                }
                                if (fruVarM8720a == null) {
                                    this.f23378b.mo13940b("Cannot associate main session with this burst, use the default setting.");
                                    npkVar = new npk(gzlVarM7065a, false);
                                } else {
                                    npkVar = new npk(gzlVarM7065a, fruVarM8720a.f23357e.f44027a);
                                }
                                frv frvVar = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                                frvVar.f23359d = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
                                ((fth) this.f23389m.get()).mo8696c(keyVarMo8787a, fuaVar2, npkVar, new frr(this, frvVar));
                                this.f23381e.add(frvVar);
                                this.f23378b.mo13940b(wUzNh.yJhTHz);
                                i3 = i7 + 1;
                                z2 = z3;
                            } else {
                                if (this.f23398v) {
                                    this.f23378b.mo13947i("almost launched empty burst; aborting");
                                    break;
                                }
                                this.f23378b.mo13940b("inserting failed shots for timestamp <" + fpxVar3.mo8670c() + ">");
                                frv frvVar2 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                                frvVar2.f23347a = false;
                                this.f23381e.add(frvVar2);
                            }
                        } else {
                            keyVarMo8787a = ftfVar.mo8787a(fpxVar3.mo8670c());
                            if (keyVarMo8787a == null) {
                                kfd kfdVarMo7041b3 = keyVarMo8787a.mo7041b();
                                kfdVarMo7041b3.getClass();
                                long j5 = kfdVarMo7041b3.f35811b;
                                this.f23378b.mo13940b("adding launch frame " + j5);
                                if (this.f23396t) {
                                    if (this.f23372B) {
                                        this.f23402z.add(fpxVar3.mo8671d());
                                    }
                                } else if (this.f23373C) {
                                    this.f23402z.add(fpxVar3.mo8671d());
                                }
                                j = Long.MAX_VALUE;
                                frsVar = null;
                                while (r4.hasNext()) {
                                    if (frsVar4.m8723d()) {
                                        long j6 = frsVar4.m8720a().f23356d;
                                        kfd kfdVarMo7041b4 = keyVarMo8787a.mo7041b();
                                        kfdVarMo7041b4.getClass();
                                        i = i3;
                                        z = z2;
                                        jAbs = Math.abs(j6 - kfdVarMo7041b4.f35811b);
                                        if (jAbs < j) {
                                            j = jAbs;
                                            frsVar = frsVar4;
                                        }
                                    } else {
                                        i = i3;
                                        z = z2;
                                    }
                                    z2 = z;
                                    i3 = i;
                                }
                                int i8 = i3;
                                boolean z4 = z2;
                                if (frsVar != null) {
                                    fruVarM8720a = frsVar.m8720a();
                                } else {
                                    fruVarM8720a = null;
                                }
                                fuaVar = this.f23400x;
                                if (fuaVar == null) {
                                    gzlVarM7065a = gzl.OFF;
                                } else {
                                    gzlVarM7065a = gzl.OFF;
                                }
                                if (fruVarM8720a == null) {
                                    this.f23378b.mo13940b("Cannot associate main session with this burst, use the default setting.");
                                    npkVar = new npk(gzlVarM7065a, false);
                                } else {
                                    npkVar = new npk(gzlVarM7065a, fruVarM8720a.f23357e.f44027a);
                                }
                                frv frvVar3 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                                frvVar3.f23359d = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
                                ((fth) this.f23389m.get()).mo8696c(keyVarMo8787a, fuaVar2, npkVar, new frr(this, frvVar3));
                                this.f23381e.add(frvVar3);
                                this.f23378b.mo13940b(wUzNh.yJhTHz);
                                i3 = i8 + 1;
                                z2 = z4;
                            } else {
                                if (this.f23398v) {
                                    this.f23378b.mo13947i("almost launched empty burst; aborting");
                                    break;
                                }
                                this.f23378b.mo13940b("inserting failed shots for timestamp <" + fpxVar3.mo8670c() + ">");
                                frv frvVar4 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                                frvVar4.f23347a = false;
                                this.f23381e.add(frvVar4);
                            }
                        }
                    } else if (this.f23375E || this.f23374D) {
                        int size4 = arrayList3.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                fpxVar3 = null;
                                break;
                            }
                            fpx fpxVar5 = (fpx) arrayList3.get(i9);
                            i9++;
                            if (MomentsUtils.m4211c(fpxVar5, this.f23371A, this.f23394r, this.f23402z)) {
                                fpxVar3 = fpxVar5;
                                break;
                            }
                        }
                        if (fpxVar3 == null) {
                            this.f23378b.mo13940b("We do not have any burst that has good quality and large diversity.");
                            break;
                        }
                        keyVarMo8787a = ftfVar.mo8787a(fpxVar3.mo8670c());
                        if (keyVarMo8787a == null) {
                            kfd kfdVarMo7041b5 = keyVarMo8787a.mo7041b();
                            kfdVarMo7041b5.getClass();
                            long j7 = kfdVarMo7041b5.f35811b;
                            this.f23378b.mo13940b("adding launch frame " + j7);
                            if (this.f23396t) {
                                if (this.f23372B) {
                                    this.f23402z.add(fpxVar3.mo8671d());
                                }
                            } else if (this.f23373C) {
                                this.f23402z.add(fpxVar3.mo8671d());
                            }
                            j = Long.MAX_VALUE;
                            frsVar = null;
                            while (r4.hasNext()) {
                                if (frsVar4.m8723d()) {
                                    long j8 = frsVar4.m8720a().f23356d;
                                    kfd kfdVarMo7041b6 = keyVarMo8787a.mo7041b();
                                    kfdVarMo7041b6.getClass();
                                    i = i3;
                                    z = z2;
                                    jAbs = Math.abs(j8 - kfdVarMo7041b6.f35811b);
                                    if (jAbs < j) {
                                        j = jAbs;
                                        frsVar = frsVar4;
                                    }
                                } else {
                                    i = i3;
                                    z = z2;
                                }
                                z2 = z;
                                i3 = i;
                            }
                            int i10 = i3;
                            boolean z5 = z2;
                            if (frsVar != null) {
                                fruVarM8720a = frsVar.m8720a();
                            } else {
                                fruVarM8720a = null;
                            }
                            fuaVar = this.f23400x;
                            if (fuaVar == null && dnr.m6446e(fuaVar.f23576d, this.f23401y)) {
                                gzlVarM7065a = this.f23376F.m9396a().m7065a();
                            } else {
                                gzlVarM7065a = gzl.OFF;
                            }
                            if (fruVarM8720a == null) {
                                this.f23378b.mo13940b("Cannot associate main session with this burst, use the default setting.");
                                npkVar = new npk(gzlVarM7065a, false);
                            } else {
                                npkVar = new npk(gzlVarM7065a, fruVarM8720a.f23357e.f44027a);
                            }
                            frv frvVar5 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                            frvVar5.f23359d = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
                            ((fth) this.f23389m.get()).mo8696c(keyVarMo8787a, fuaVar2, npkVar, new frr(this, frvVar5));
                            this.f23381e.add(frvVar5);
                            this.f23378b.mo13940b(wUzNh.yJhTHz);
                            i3 = i10 + 1;
                            z2 = z5;
                        } else {
                            if (this.f23398v) {
                                this.f23378b.mo13947i("almost launched empty burst; aborting");
                                break;
                            }
                            this.f23378b.mo13940b("inserting failed shots for timestamp <" + fpxVar3.mo8670c() + ">");
                            frv frvVar6 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                            frvVar6.f23347a = false;
                            this.f23381e.add(frvVar6);
                        }
                    } else {
                        keyVarMo8787a = ftfVar.mo8787a(fpxVar3.mo8670c());
                        if (keyVarMo8787a == null) {
                            kfd kfdVarMo7041b7 = keyVarMo8787a.mo7041b();
                            kfdVarMo7041b7.getClass();
                            long j9 = kfdVarMo7041b7.f35811b;
                            this.f23378b.mo13940b("adding launch frame " + j9);
                            if (this.f23396t) {
                                if (this.f23372B) {
                                    this.f23402z.add(fpxVar3.mo8671d());
                                }
                            } else if (this.f23373C) {
                                this.f23402z.add(fpxVar3.mo8671d());
                            }
                            j = Long.MAX_VALUE;
                            frsVar = null;
                            while (r4.hasNext()) {
                                if (frsVar4.m8723d()) {
                                    long j10 = frsVar4.m8720a().f23356d;
                                    kfd kfdVarMo7041b8 = keyVarMo8787a.mo7041b();
                                    kfdVarMo7041b8.getClass();
                                    i = i3;
                                    z = z2;
                                    jAbs = Math.abs(j10 - kfdVarMo7041b8.f35811b);
                                    if (jAbs < j) {
                                        j = jAbs;
                                        frsVar = frsVar4;
                                    }
                                } else {
                                    i = i3;
                                    z = z2;
                                }
                                z2 = z;
                                i3 = i;
                            }
                            int i11 = i3;
                            boolean z6 = z2;
                            if (frsVar != null) {
                                fruVarM8720a = frsVar.m8720a();
                            } else {
                                fruVarM8720a = null;
                            }
                            fuaVar = this.f23400x;
                            if (fuaVar == null) {
                                gzlVarM7065a = gzl.OFF;
                            } else {
                                gzlVarM7065a = gzl.OFF;
                            }
                            if (fruVarM8720a == null) {
                                this.f23378b.mo13940b("Cannot associate main session with this burst, use the default setting.");
                                npkVar = new npk(gzlVarM7065a, false);
                            } else {
                                npkVar = new npk(gzlVarM7065a, fruVarM8720a.f23357e.f44027a);
                            }
                            frv frvVar7 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                            frvVar7.f23359d = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
                            ((fth) this.f23389m.get()).mo8696c(keyVarMo8787a, fuaVar2, npkVar, new frr(this, frvVar7));
                            this.f23381e.add(frvVar7);
                            this.f23378b.mo13940b(wUzNh.yJhTHz);
                            i3 = i11 + 1;
                            z2 = z6;
                        } else {
                            if (this.f23398v) {
                                this.f23378b.mo13947i("almost launched empty burst; aborting");
                                break;
                            }
                            this.f23378b.mo13940b("inserting failed shots for timestamp <" + fpxVar3.mo8670c() + ">");
                            frv frvVar8 = new frv(fpxVar3.mo8670c(), fpxVar3.mo8669b(), fpxVar3.mo8668a());
                            frvVar8.f23347a = false;
                            this.f23381e.add(frvVar8);
                        }
                    }
                }
            }
        }
        long jM8535a = this.f23377a.m8535a();
        ArrayList arrayList4 = new ArrayList();
        for (frt frtVar4 : this.f23380d) {
            kbo kboVar = this.f23378b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = frtVar4.f23351c.m17180i();
            objArr[1] = frtVar4.f23351c.m17184m() ? ((Long) frtVar4.f23351c.m17181j()).toString() : "UNSPEC";
            kboVar.mo13946h(String.format(locale, "Considering track for finishing, %d to: %s", objArr));
            if (frtVar4.f23351c.m17184m()) {
                if (frtVar4.f23352d) {
                    this.f23378b.mo13947i("Ending high-res track " + String.valueOf(frtVar4.f23349a) + " due to imminent timeout");
                    this.f23378b.mo13947i("Track timing out: ".concat(m8727u(frtVar4, this.f23386j.mo8679c()).toString()));
                } else if (((Long) frtVar4.f23351c.m17181j()).longValue() <= jM8535a || this.f23398v) {
                    List listMo8679c2 = this.f23386j.mo8679c();
                    this.f23378b.mo13940b(String.format(Locale.US, hsSUWRJfoeC.vvmcsoiPhCJULeA, Integer.valueOf(listMo8679c2.size()), frtVar4.f23349a));
                    frw frwVarM8727u = m8727u(frtVar4, listMo8679c2);
                    this.f23378b.mo13940b(frwVarM8727u.toString());
                    if (frwVarM8727u.f23363a + frwVarM8727u.f23364b <= 0 || frwVarM8727u.f23368f >= m8725s(m8726t(frtVar4), frtVar4.f23353e)) {
                        this.f23378b.mo13940b("... and we found no reason why not to finish");
                    } else {
                        this.f23378b.mo13940b("... but we're still waiting for frames");
                    }
                } else {
                    this.f23378b.mo13940b("... but we might still have incoming frames (... latest timestamp: " + jM8535a + ")");
                }
                ArrayList<frv> arrayList5 = new ArrayList();
                mrm mrmVarM8728v = mqu.f41450a;
                mrm mrmVarM8728v2 = mrmVarM8728v;
                for (frs frsVar5 : this.f23381e) {
                    if (frtVar4.f23351c.m17185n(frsVar5.mo8722c())) {
                        kbo kboVar2 = this.f23378b;
                        String string = frsVar5.mo8722c().toString();
                        String strValueOf = String.valueOf(frtVar4.f23351c);
                        StringBuilder sb = new StringBuilder();
                        j2 = jM8535a;
                        sb.append("adding frame from burst: ");
                        sb.append(string);
                        sb.append(" to track with range ");
                        sb.append(strValueOf);
                        kboVar2.mo13940b(sb.toString());
                        if (frsVar5.m8723d()) {
                            this.f23378b.mo13940b("... actually, skipping it since it's from a main shot");
                        } else if (frsVar5.f23348b.mo16813g()) {
                            mrmVarM8728v = m8728v(mrmVarM8728v, frsVar5.m8721b().f23358c);
                            arrayList5.add(frsVar5.m8721b());
                            jM8535a = j2;
                        } else {
                            mrmVarM8728v2 = m8728v(mrmVarM8728v2, frsVar5.m8721b().f23358c);
                            this.f23378b.mo13940b("... actually, skipping it since it's still in flight");
                            jM8535a = j2;
                        }
                    } else {
                        j2 = jM8535a;
                    }
                    jM8535a = j2;
                }
                long j11 = jM8535a;
                if (mrmVarM8728v.mo16813g() && mrmVarM8728v2.mo16813g() && ((Long) mrmVarM8728v2.mo16809c()).longValue() < ((Long) mrmVarM8728v.mo16809c()).longValue()) {
                    this.f23378b.mo13940b("earlier moments frame might drop: frame <" + mrmVarM8728v2.mo16809c().toString() + "> is still in flight, while frame <" + mrmVarM8728v.mo16809c().toString() + "> is finished.");
                }
                Collections.sort(arrayList5, amx.f745i);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                this.f23378b.mo13940b("Sending frames for encoding for ".concat(String.valueOf(String.valueOf(frtVar4.f23349a))));
                for (frv frvVar9 : arrayList5) {
                    kpw kpwVarM14585k = ((kmv) frvVar9.f23348b.mo16809c()).m14585k();
                    kpwVarM14585k.getClass();
                    lku.m15614I(frvVar9.f23359d.mo16813g(), "Start time not available for Moments shot");
                    lku.m15614I(frvVar9.f23360e.mo16813g(), HRLmc.HWQThfxCMBJpbCx);
                    long jLongValue = ((Long) frvVar9.f23360e.mo16809c()).longValue() - ((Long) frvVar9.f23359d.mo16809c()).longValue();
                    arrayList7.add(Long.valueOf(jLongValue));
                    this.f23378b.mo13940b("Moments HDR+ processing time in ms: " + jLongValue);
                    this.f23378b.mo13940b("sending out for encoding: <" + (kpwVarM14585k.mo7248d() / 1000) + ">");
                    if (frtVar4.f23350b.mo8697a(kpwVarM14585k)) {
                        this.f23378b.mo13940b(" >> success");
                        arrayList6.add(new kau(kpwVarM14585k.mo7248d(), frvVar9.f23362g));
                    } else {
                        this.f23378b.mo13940b(" >> failed to encode");
                    }
                }
                this.f23378b.mo13940b("Setting stream with a set of " + arrayList6.size() + " frames.");
                frtVar4.f23350b.close();
                frtVar4.f23354f.m15389f(mws.m17095j(arrayList7));
                this.f23391o.mo8759d(frtVar4.f23349a, arrayList6);
                arrayList4.add(frtVar4);
                jM8535a = j11;
            } else {
                this.f23378b.mo13946h("... but it doesn't have an upper bound yet");
            }
        }
        this.f23380d.removeAll(arrayList4);
        long jM8535a2 = this.f23377a.m8535a();
        ArrayList arrayList8 = new ArrayList();
        for (frs frsVar6 : this.f23381e) {
            if (!frsVar6.f23347a) {
                Iterator it3 = this.f23380d.iterator();
                do {
                    if (!it3.hasNext()) {
                        if (!frsVar6.mo8722c().m17185n(mzj.m17173c(Long.valueOf((-2000000000) + jM8535a2)))) {
                            arrayList8.add(frsVar6);
                            break;
                        }
                        break;
                    }
                } while (!((frt) it3.next()).f23351c.m17185n(frsVar6.mo8722c()));
            }
        }
        int size5 = arrayList8.size();
        for (int i12 = 0; i12 < size5; i12++) {
            frs frsVar7 = (frs) arrayList8.get(i12);
            if (frsVar7.f23348b.mo16813g()) {
                lku.m15614I(frsVar7.mo8724e(), "We shouldn't get results for main shots");
                this.f23378b.mo13940b("Disposing of YUV frame from burst: " + frsVar7.m8721b().f23358c);
                ((kmv) frsVar7.f23348b.mo16809c()).m14586l();
            } else {
                this.f23378b.mo13940b("... nothing to close as it never completed.");
            }
        }
        this.f23381e.removeAll(arrayList8);
        float f = Float.MAX_VALUE;
        int i13 = 0;
        frv frvVarM8721b = null;
        for (frs frsVar8 : this.f23381e) {
            if (!frsVar8.f23347a && !frsVar8.m8723d()) {
                if (frsVar8.m8721b().f23361f < f) {
                    f = frsVar8.m8721b().f23361f;
                    frvVarM8721b = frsVar8.m8721b();
                }
                i13++;
            }
        }
        long jM8535a3 = this.f23377a.m8535a();
        long jMin = jM8535a3;
        for (frt frtVar5 : this.f23380d) {
            jMin = Math.min(jMin, frtVar5.f23351c.m17183l() ? ((Long) frtVar5.f23351c.m17180i()).longValue() : jMin);
            jM8535a3 = Math.max(jM8535a3, frtVar5.f23351c.m17184m() ? ((Long) frtVar5.f23351c.m17181j()).longValue() : jM8535a3);
        }
        if (i13 >= m8725s(TimeUnit.MILLISECONDS.convert(jM8535a3 - jMin, TimeUnit.NANOSECONDS), true) && frvVarM8721b != null) {
            this.f23378b.mo13940b("YUV cap reached. Disposing of YUV frame from burst: " + frvVarM8721b.f23358c);
            if (frvVarM8721b.f23348b.mo16813g()) {
                ((kmv) frvVarM8721b.f23348b.mo16809c()).m14586l();
            } else {
                this.f23378b.mo13940b("... nothing to close as it never completed.");
            }
            this.f23381e.remove(frvVarM8721b);
            m8733c(frvVarM8721b.f23358c);
        }
        if (this.f23380d.isEmpty() && this.f23381e.isEmpty() && this.f23383g == 0) {
            if (this.f23400x != null || this.f23399w != null) {
                this.f23378b.mo13940b("nothing is in flight; cleaning up last parameters & buffers");
            }
            this.f23400x = null;
            this.f23399w = null;
        }
        Iterator it4 = this.f23380d.iterator();
        while (it4.hasNext()) {
            if (!((frt) it4.next()).f23351c.m17184m() && !this.f23379c) {
                this.f23379c = true;
                Handler handler = this.f23384h;
                fnx fnxVar = new fnx(this, 13);
                ftd ftdVar = this.f23385i;
                handler.postDelayed(fnxVar, ftdVar.f23546c * ((long) ftdVar.f23547d));
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private final boolean m8730x(fpx fpxVar) {
        for (frs frsVar : this.f23381e) {
            if (frsVar.mo8724e() && frsVar.m8721b().f23358c == fpxVar.mo8670c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.fto
    /* JADX INFO: renamed from: a */
    public final kba mo8731a() {
        this.f23384h.post(new fnx(this, 12));
        return new ezc(this, 11);
    }

    /* JADX INFO: renamed from: b */
    public final void m8732b(frt frtVar) {
        frtVar.f23350b.close();
        fti ftiVar = this.f23391o;
        gyu gyuVar = frtVar.f23349a;
        int i = mws.f41739d;
        ftiVar.mo8759d(gyuVar, mzr.f41857a);
        this.f23380d.remove(frtVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m8733c(long j) {
        for (gth gthVar : this.f23402z) {
            if (gthVar.f26339a == j) {
                this.f23402z.remove(gthVar);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8734d() {
        for (frs frsVar : this.f23381e) {
            String string = frsVar.mo8724e() ? Long.toString(frsVar.m8721b().f23358c) : frsVar.m8720a().f23356d + " est.";
            kbo kboVar = this.f23378b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = true != frsVar.mo8724e() ? "MAIN  " : "MTS   ";
            boolean zMo16813g = frsVar.f23348b.mo16813g();
            String str = IuyLAqNmW.DevJOrtgEF;
            String str2 = aJFPpVSaoDO.zloA;
            objArr[1] = true != zMo16813g ? str : str2;
            if (frsVar.mo8724e()) {
                frsVar.m8721b();
            }
            objArr[2] = str;
            if (true != frsVar.f23347a) {
                str2 = "NO";
            }
            objArr[3] = str2;
            objArr[4] = string;
            kboVar.mo13946h(String.format(locale, "   session; type: %s has_image: %s cancel: %s pending: %s timestamps: %s", objArr));
        }
        for (frt frtVar : this.f23380d) {
            kbo kboVar2 = this.f23378b;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[3];
            objArr2[0] = frtVar.f23351c.m17180i();
            objArr2[1] = frtVar.f23351c.m17184m() ? ((Long) frtVar.f23351c.m17181j()).toString() : "UNSPEC";
            objArr2[2] = frtVar.f23349a;
            kboVar2.mo13946h(String.format(locale2, "   track from: %d to: %s uri: %s", objArr2));
        }
        Iterator it = this.f23382f.iterator();
        while (it.hasNext()) {
            this.f23378b.mo13946h(String.format(Locale.US, "not a HDR+ shot: %s", (gyu) it.next()));
        }
    }

    @Override // p000.ftp
    /* JADX INFO: renamed from: e */
    public final void mo8735e(gyu gyuVar) {
        this.f23384h.post(new fro(this, gyuVar, 0));
    }

    @Override // p000.fto
    /* JADX INFO: renamed from: f */
    public final synchronized void mo8736f(gyu gyuVar) {
        this.f23378b.mo13940b("Track " + String.valueOf(gyuVar) + " just about to time out; trying to finish up");
        for (frt frtVar : this.f23380d) {
            if (frtVar.f23349a.equals(gyuVar)) {
                frtVar.f23352d = true;
                this.f23378b.mo13940b("... found it");
                m8741k();
                return;
            }
        }
        this.f23378b.mo13940b("... probably done already");
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m8737g() {
        this.f23398v = true;
        m8741k();
    }

    @Override // p000.ftp
    /* JADX INFO: renamed from: h */
    public final void mo8738h(gyu gyuVar, long j) {
        this.f23384h.post(new dcr(this, gyuVar, j, 10));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m8739i(gyu gyuVar, long j) {
        for (frs frsVar : this.f23381e) {
            if (frsVar.m8723d() && frsVar.m8720a().f23355c.equals(gyuVar)) {
                lku.m15613H(frsVar.f23347a);
                boolean z = true;
                lku.m15613H(!frsVar.f23348b.mo16813g());
                if (this.f23372B && !this.f23396t) {
                    fpx fpxVarMo8678b = this.f23386j.mo8678b(j);
                    boolean z2 = fpxVarMo8678b.mo8673f().mo16813g() && ((gtt) fpxVarMo8678b.mo8673f().mo16809c()).f26393a.length > 0;
                    this.f23374D = !z2 && this.f23393q.mo6184l(dij.f11554D) && this.f23393q.mo6184l(dij.f11555E);
                    if (!z2 || !this.f23393q.mo6184l(dij.f11552B) || !this.f23393q.mo6184l(dij.f11553C)) {
                        z = false;
                    }
                    this.f23375E = z;
                    this.f23402z.add(fpxVarMo8678b.mo8671d());
                    this.f23371A = fpxVarMo8678b.mo8668a();
                }
                frsVar.f23347a = false;
                this.f23378b.mo13940b("Incoming YUV frame " + String.valueOf(gyuVar) + " CROSS : " + String.valueOf(gyuVar));
                m8741k();
            }
        }
        m8734d();
        throw new RuntimeException("Too many incoming YUV shots; we didn't start this many");
    }

    /* JADX INFO: renamed from: j */
    public final void m8740j() {
        if (this.f23393q.mo6184l(dij.f11595s)) {
            Trace.beginSection("Moments Prewarm");
            ((fsz) this.f23390n.get()).mo4206a();
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m8741k() {
        m8734d();
        this.f23378b.mo13940b("running update");
        m8729w();
        m8734d();
    }

    @Override // p000.fto
    /* JADX INFO: renamed from: l */
    public final synchronized ftn mo8742l(gyu gyuVar, long j, kay kayVar, boolean z, lih lihVar, kyt kytVar) {
        this.f23378b.mo13940b("Microvideo started at <" + j + ">");
        this.f23396t = z;
        boolean z2 = false;
        if (z) {
            dhv dhvVar = this.f23393q;
            dhx dhxVar = dii.f11525a;
            dhvVar.mo6175c();
            if (!this.f23393q.mo6184l(dii.f11529e)) {
                z2 = true;
            }
        }
        if (this.f23392p.mo8764a() != 1 && !z2) {
            m8740j();
            this.f23395s.mo8706c(this.f23396t ? fqh.LONGSHOT_MODE : fqh.TOPSHOT_MODE);
            lihVar.m15387d();
            frt frtVar = new frt(gyuVar, lihVar, z, null, null);
            frtVar.f23351c = mzj.m17173c(Long.valueOf(TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS)));
            this.f23380d.addLast(frtVar);
            fqu fqdVar = new fqd(this.f23396t ? this.f23388l : this.f23387k, kytVar, kayVar);
            if ((z && this.f23393q.mo6184l(dij.f11591o)) || (!z && this.f23393q.mo6184l(dij.f11592p))) {
                fqdVar = new fqc(fqdVar);
            }
            frtVar.f23350b = fqdVar;
            m8741k();
            return new frp(this, frtVar);
        }
        this.f23378b.mo13940b("... but Moments is disabled by the switcher; ignoring.");
        fti ftiVar = this.f23391o;
        int i = mws.f41739d;
        ftiVar.mo8759d(gyuVar, mzr.f41857a);
        lihVar.m15388e();
        kytVar.close();
        return new ftq(1);
    }

    @Override // p000.ftp
    /* JADX INFO: renamed from: m */
    public final void mo8743m(gyu gyuVar, npk npkVar) {
        this.f23384h.post(new frn(this, gyuVar, npkVar, this.f23377a.m8535a(), 0, null, null));
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m8744n(gyu gyuVar, npk npkVar, long j) {
        fru fruVar = new fru(j, npkVar, gyuVar, null, null);
        this.f23381e.add(fruVar);
        this.f23378b.mo13940b("adding main shot ".concat(fruVar.toString()));
        m8741k();
    }

    @Override // p000.ftb
    /* JADX INFO: renamed from: o */
    public final void mo8745o(ftf ftfVar, glk glkVar) {
        this.f23384h.post(new epm(this, ftfVar, glkVar, 14, (byte[]) null, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final synchronized void m8746p(ftf ftfVar, glk glkVar) {
        this.f23378b.mo13940b("HDR+ command finished; possibly launching Moments processing");
        this.f23397u = true;
        this.f23399w = ftfVar;
        this.f23400x = (fua) glkVar.f25503d;
        this.f23401y = glkVar.f25502c.mo9903i();
        if (glkVar.f25502c.mo9903i() != gyw.LONG_SHOT) {
            gyu gyuVarMo9902h = glkVar.f25502c.mo9902h();
            Iterator it = this.f23381e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f23382f.add(gyuVarMo9902h);
                    ((fua) glkVar.f25503d).f23578f.m13537d(new eip(this, gyuVarMo9902h, 13));
                    break;
                } else {
                    frs frsVar = (frs) it.next();
                    if (frsVar.m8723d() && frsVar.m8720a().f23355c.equals(gyuVarMo9902h)) {
                        break;
                    }
                }
            }
        }
        m8741k();
    }

    @Override // p000.ftb
    /* JADX INFO: renamed from: q */
    public final void mo8747q(ftf ftfVar, glk glkVar) {
        this.f23384h.post(new epm(this, ftfVar, glkVar, 13, (byte[]) null, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final synchronized void m8748r(ftf ftfVar, glk glkVar) {
        this.f23399w = ftfVar;
        this.f23400x = (fua) glkVar.f25503d;
        this.f23401y = glkVar.f25502c.mo9903i();
        this.f23397u = false;
        this.f23402z.clear();
        m8741k();
    }
}
