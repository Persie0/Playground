package com.lingq.feature.imports;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Parcelable;
import com.lingq.core.common.network.C1262a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bia;
import p000.bt2;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.do7;
import p000.dr5;
import p000.du0;
import p000.eh9;
import p000.f24;
import p000.fa4;
import p000.g41;
import p000.hf6;
import p000.hm5;
import p000.ika;
import p000.jka;
import p000.lda;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.ob1;
import p000.pb1;
import p000.pka;
import p000.r32;
import p000.si7;
import p000.u91;
import p000.vk9;
import p000.wta;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.imports.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2109f extends wta implements jka, cma, bia, r32 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jka f26170b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f26171c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f26172d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r32 f26173e;

    /* JADX INFO: renamed from: f */
    public final d65 f26174f;

    /* JADX INFO: renamed from: g */
    public final nm7 f26175g;

    /* JADX INFO: renamed from: h */
    public final si7 f26176h;

    /* JADX INFO: renamed from: i */
    public final ob1 f26177i;

    /* JADX INFO: renamed from: j */
    public final hm5 f26178j;

    /* JADX INFO: renamed from: k */
    public final C2104a f26179k;

    /* JADX INFO: renamed from: l */
    public final nn1 f26180l;

    /* JADX INFO: renamed from: m */
    public final pka f26181m;

    /* JADX INFO: renamed from: n */
    public final C3244l f26182n;

    /* JADX INFO: renamed from: o */
    public final c18 f26183o;

    /* JADX INFO: renamed from: p */
    public final C3244l f26184p;

    /* JADX INFO: renamed from: q */
    public final C3244l f26185q;

    /* JADX INFO: renamed from: r */
    public final C3244l f26186r;

    /* JADX INFO: renamed from: s */
    public final C3244l f26187s;

    /* JADX INFO: renamed from: t */
    public final c18 f26188t;

    /* JADX INFO: renamed from: u */
    public final c18 f26189u;

    /* JADX INFO: renamed from: v */
    public final C3211a f26190v;

    /* JADX INFO: renamed from: w */
    public final du0 f26191w;

    public C2109f(d65 d65Var, nm7 nm7Var, si7 si7Var, ob1 ob1Var, C1262a c1262a, jka jkaVar, r32 r32Var, hm5 hm5Var, C2104a c2104a, nn1 nn1Var, bia biaVar, cma cmaVar, nl8 nl8Var) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        dr5 dr5VarM15424b;
        String str4;
        d65Var.getClass();
        nm7Var.getClass();
        si7Var.getClass();
        ob1Var.getClass();
        jkaVar.getClass();
        r32Var.getClass();
        hm5Var.getClass();
        biaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f26170b = jkaVar;
        this.f26171c = cmaVar;
        this.f26172d = biaVar;
        this.f26173e = r32Var;
        this.f26174f = d65Var;
        this.f26175g = nm7Var;
        this.f26176h = si7Var;
        this.f26177i = ob1Var;
        this.f26178j = hm5Var;
        this.f26179k = c2104a;
        this.f26180l = nn1Var;
        pka.Companion.getClass();
        if (nl8Var.m17487a("url")) {
            str = (String) nl8Var.m17488b("url");
            if (str == null) {
                C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        if (nl8Var.m17487a("title")) {
            str2 = (String) nl8Var.m17488b("title");
            if (str2 == null) {
                C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str2 = "";
        }
        if (nl8Var.m17487a("fileUri")) {
            str3 = (String) nl8Var.m17488b("fileUri");
            if (str3 == null) {
                C3386nv.m17626m("Argument \"fileUri\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str3 = "";
        }
        if (nl8Var.m17487a("fromExternal")) {
            bool = (Boolean) nl8Var.m17488b("fromExternal");
            if (bool == null) {
                C3386nv.m17626m("Argument \"fromExternal\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (!nl8Var.m17487a("type")) {
            C3386nv.m17626m("Required argument \"type\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(UserImportSourceType.class) && !Serializable.class.isAssignableFrom(UserImportSourceType.class)) {
            C3386nv.m17636w(UserImportSourceType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        UserImportSourceType userImportSourceType = (UserImportSourceType) nl8Var.m17488b("type");
        if (userImportSourceType == null) {
            C3386nv.m17626m("Argument \"type\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f26181m = new pka(userImportSourceType, str, str2, str3, bool.booleanValue());
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f26182n = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f26183o = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        Boolean bool2 = Boolean.FALSE;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool2);
        this.f26184p = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f26185q = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(new Pair(0, ""));
        this.f26186r = c3244lM17114d4;
        this.f26187s = AbstractC3352my.m17114d(null);
        c18 c18VarM15520B = AbstractC3224d.m15520B(((C1368a) si7Var).f18360M1, lda.m16103C(this), c3243k, bool2);
        this.f26188t = c18VarM15520B;
        this.f26189u = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c3244lM17114d2, new C3228h(jkaVar.mo9014u2(), c1262a.f14392b, new UserImportViewModel$importDataWithConnectivity$1(3, null)), c3244lM17114d3, c3244lM17114d4, c18VarM15520B, new UserImportViewModel$importUiState$1(null)), lda.m16103C(this), c3243k, f24.f38306a);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f26190v = c3211aM10525a;
        this.f26191w = AbstractC3224d.m15519A(c3211aM10525a);
        if (vk9.m23391n0(str2) && vk9.m23391n0(str)) {
            return;
        }
        ika ikaVar = (ika) jkaVar.mo9014u2().getValue();
        ikaVar.getClass();
        ikaVar.f44238b = str2;
        if (AbstractC3352my.m17089H(str)) {
            ikaVar.f44242f = str;
            ikaVar.f44241e = "URL";
        } else {
            ikaVar.f44241e = "Text";
            String str5 = (String) u91.m22598P0(vk9.m23365A0(str, new String[]{" "}, 0, 6));
            if (str5 != null && AbstractC3352my.m17089H(str5) && (dr5VarM15424b = new Regex("\"([^\"]*)\"").m15424b(str)) != null && (str4 = (String) u91.m22592J0(1, dr5VarM15424b.m10610a())) != null) {
                str = str4;
            }
            ikaVar.f44243g = str;
        }
        jkaVar.mo9011N0(ikaVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[PHI: r9
      0x007e: PHI (r9v3 ika) = (r9v2 ika), (r9v6 ika) binds: [B:27:0x007b, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r0).m7848G(r8, r1) == r10) goto L31;
     */
    /* JADX INFO: renamed from: V2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9015V2(C2109f c2109f, ika ikaVar, ContinuationImpl continuationImpl) throws Throwable {
        UserImportViewModel$saveImportPreferences$1 userImportViewModel$saveImportPreferences$1;
        String str;
        si7 si7Var = c2109f.f26176h;
        if (continuationImpl instanceof UserImportViewModel$saveImportPreferences$1) {
            userImportViewModel$saveImportPreferences$1 = (UserImportViewModel$saveImportPreferences$1) continuationImpl;
            int i = userImportViewModel$saveImportPreferences$1.f26138d;
            if ((i & Integer.MIN_VALUE) != 0) {
                userImportViewModel$saveImportPreferences$1.f26138d = i - Integer.MIN_VALUE;
            } else {
                userImportViewModel$saveImportPreferences$1 = new UserImportViewModel$saveImportPreferences$1(c2109f, continuationImpl);
            }
        } else {
            userImportViewModel$saveImportPreferences$1 = new UserImportViewModel$saveImportPreferences$1(c2109f, continuationImpl);
        }
        Object obj = userImportViewModel$saveImportPreferences$1.f26136b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userImportViewModel$saveImportPreferences$1.f26138d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            String str2 = ikaVar.f44237a;
            userImportViewModel$saveImportPreferences$1.f26135a = ikaVar;
            userImportViewModel$saveImportPreferences$1.f26138d = 1;
            if (((C1368a) si7Var).m7846E(str2, userImportViewModel$saveImportPreferences$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ikaVar = userImportViewModel$saveImportPreferences$1.f26135a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                ikaVar = userImportViewModel$saveImportPreferences$1.f26135a;
                AbstractC3193b.m15359b(obj);
                str = ikaVar.f44240d;
                userImportViewModel$saveImportPreferences$1.f26135a = ikaVar;
                userImportViewModel$saveImportPreferences$1.f26138d = 3;
                if (((C1368a) si7Var).m7847F(str, userImportViewModel$saveImportPreferences$1) != coroutineSingletons) {
                    Set setM22627s1 = u91.m22627s1(ikaVar.f44245i);
                    userImportViewModel$saveImportPreferences$1.f26135a = null;
                    userImportViewModel$saveImportPreferences$1.f26138d = 4;
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                ikaVar = userImportViewModel$saveImportPreferences$1.f26135a;
                AbstractC3193b.m15359b(obj);
                Set setM22627s2 = u91.m22627s1(ikaVar.f44245i);
                userImportViewModel$saveImportPreferences$1.f26135a = null;
                userImportViewModel$saveImportPreferences$1.f26138d = 4;
            } else {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        String str3 = ikaVar.f44239c;
        userImportViewModel$saveImportPreferences$1.f26135a = ikaVar;
        userImportViewModel$saveImportPreferences$1.f26138d = 2;
        if (((C1368a) si7Var).m7845D(str3, userImportViewModel$saveImportPreferences$1) != coroutineSingletons) {
            str = ikaVar.f44240d;
            userImportViewModel$saveImportPreferences$1.f26135a = ikaVar;
            userImportViewModel$saveImportPreferences$1.f26138d = 3;
            if (((C1368a) si7Var).m7847F(str, userImportViewModel$saveImportPreferences$1) != coroutineSingletons) {
                Set setM22627s3 = u91.m22627s1(ikaVar.f44245i);
                userImportViewModel$saveImportPreferences$1.f26135a = null;
                userImportViewModel$saveImportPreferences$1.f26138d = 4;
            }
        }
        return coroutineSingletons;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26171c.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26171c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26171c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26171c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26171c.mo4575D0(continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f26173e.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26171c.mo4576F1(str, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f26173e.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26171c.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26171c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26171c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26171c.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26171c.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f26172d.mo3737M1(upgradeReason);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f26173e.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26171c.mo4582N();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: N0 */
    public final void mo9011N0(ika ikaVar) {
        this.f26170b.mo9011N0(ikaVar);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26171c.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26171c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26171c.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f26173e.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f26173e.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26171c.mo4586T0();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9016W2() {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        do {
            c3244l = this.f26185q;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        do {
            c3244l2 = this.f26186r;
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, new Pair(0, "")));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26171c.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9017X2(ContentResolver contentResolver, Uri uri, ika ikaVar) throws IOException {
        C3244l c3244l;
        Object value;
        Object value2;
        byte[] bArrM19026N;
        uri.getClass();
        this.f26170b.mo9011N0(ikaVar);
        try {
            C3244l c3244l2 = this.f26187s;
            do {
                value2 = c3244l2.getValue();
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        bArrM19026N = pb1.m19026N(inputStreamOpenInputStream);
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    bArrM19026N = null;
                }
            } while (!c3244l2.m15570h(value2, bArrM19026N));
        } catch (OutOfMemoryError unused) {
            do {
                c3244l = this.f26185q;
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new bt2("File size exceeds the maximum allowed limit.")));
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9018Y2(String str) {
        str.getClass();
        jka jkaVar = this.f26170b;
        jkaVar.mo9011N0(fa4.m11650l(((ika) jkaVar.mo9014u2().getValue()).f44241e, "URL") ? ika.m13999a((ika) jkaVar.mo9014u2().getValue(), null, null, null, null, null, str, null, null, null, 991) : ika.m13999a((ika) jkaVar.mo9014u2().getValue(), null, null, null, null, null, null, str, null, null, 959));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f26172d.mo3738Z();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f26173e.mo8245Z1(hf6Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26171c.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26171c.mo4589b2();
    }

    @Override // p000.jka
    public final void clear() {
        this.f26170b.clear();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26171c.mo4590d0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f26173e.mo8247e0(str, j);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26171c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f26173e.mo8248h1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f26172d.mo3739j2();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f26173e.mo8249k();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f26172d.mo3740k2();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: l0 */
    public final eh9 mo9013l0() {
        return this.f26170b.mo9013l0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26171c.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26171c.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f26172d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26171c.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f26172d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26171c.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26171c.mo4596t();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: u2 */
    public final eh9 mo9014u2() {
        return this.f26170b.mo9014u2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26171c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26171c.mo4598w2();
    }
}
