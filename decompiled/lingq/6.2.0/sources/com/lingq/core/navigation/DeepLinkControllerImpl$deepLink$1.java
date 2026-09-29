package com.lingq.core.navigation;

import android.net.Uri;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.ImportData;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.web2wave.C1545b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.a42;
import p000.b42;
import p000.bf6;
import p000.c32;
import p000.cf6;
import p000.cl9;
import p000.d42;
import p000.df6;
import p000.e42;
import p000.ee6;
import p000.ef6;
import p000.f42;
import p000.fe6;
import p000.g42;
import p000.ge6;
import p000.gf6;
import p000.h42;
import p000.i42;
import p000.j42;
import p000.je6;
import p000.k42;
import p000.ke6;
import p000.l42;
import p000.le6;
import p000.m42;
import p000.me6;
import p000.n42;
import p000.ne6;
import p000.nm7;
import p000.nn1;
import p000.o42;
import p000.oe6;
import p000.p42;
import p000.pe6;
import p000.q42;
import p000.qe6;
import p000.qm7;
import p000.r42;
import p000.re6;
import p000.s42;
import p000.se6;
import p000.t42;
import p000.tad;
import p000.te6;
import p000.u32;
import p000.ue6;
import p000.un1;
import p000.ve6;
import p000.vi7;
import p000.vk9;
import p000.we6;
import p000.wfb;
import p000.x32;
import p000.xe6;
import p000.xfa;
import p000.y32;
import p000.z32;
import p000.ze6;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.navigation.DeepLinkControllerImpl$deepLink$1", m4291f = "DeepLinkController.kt", m4292l = {77, 78, 80, 83}, m4293m = "invokeSuspend", m4294v = 2)
final class DeepLinkControllerImpl$deepLink$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public u32 f20239a;

    /* JADX INFO: renamed from: b */
    public u32 f20240b;

    /* JADX INFO: renamed from: c */
    public int f20241c;

    /* JADX INFO: renamed from: d */
    public int f20242d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f20243e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1552a f20244f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f20245g;

    /* JADX INFO: renamed from: com.lingq.core.navigation.DeepLinkControllerImpl$deepLink$1$5 */
    @c32(m4290c = "com.lingq.core.navigation.DeepLinkControllerImpl$deepLink$1$5", m4291f = "DeepLinkController.kt", m4292l = {241}, m4293m = "invokeSuspend", m4294v = 2)
    final class C15515 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f20246a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1552a f20247b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s42 f20248c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15515(C1552a c1552a, s42 s42Var, Continuation continuation) {
            super(2, continuation);
            this.f20247b = c1552a;
            this.f20248c = s42Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C15515(this.f20247b, this.f20248c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C15515) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f20246a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1545b c1545b = this.f20247b.f20260d;
                s42 s42Var = this.f20248c;
                String str = s42Var.f60265a;
                String str2 = s42Var.f60266b;
                this.f20246a = 1;
                if (c1545b.m8229a(str, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$deepLink$1(long j, C1552a c1552a, String str, Continuation continuation) {
        super(2, continuation);
        this.f20243e = j;
        this.f20244f = c1552a;
        this.f20245g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeepLinkControllerImpl$deepLink$1(this.f20243e, this.f20244f, this.f20245g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DeepLinkControllerImpl$deepLink$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0243  */
    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0259  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d  */
    /* JADX WARN: Code duplicated, block: B:113:0x026f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0274  */
    /* JADX WARN: Code duplicated, block: B:116:0x0288  */
    /* JADX WARN: Code duplicated, block: B:118:0x028c  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:138:0x0302  */
    /* JADX WARN: Code duplicated, block: B:139:0x030b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0311  */
    /* JADX WARN: Code duplicated, block: B:142:0x031a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[PHI: r4 r13 r15
      0x0089: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v19 java.lang.Object) binds: [B:28:0x0086, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r13v15 int) = (r13v12 int), (r13v17 int) binds: [B:28:0x0086, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r15v3 int) = (r15v2 int), (r15v6 int) binds: [B:28:0x0086, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        String str;
        int i;
        int i2;
        Object objM15541t2;
        u32 u32Var;
        Object objM15541t3;
        u32 u32Var2;
        int i3;
        tad tadVarM22429b;
        boolean z;
        pe6 pe6Var;
        String str2;
        String str3;
        ne6 ne6Var;
        b42 b42Var;
        String str4;
        String str5;
        Integer num;
        String str6;
        String str7;
        n42 n42Var;
        String str8;
        q42 q42Var;
        h42 h42Var;
        String str9;
        Integer num2;
        y32 y32Var;
        Uri uri;
        x32 x32Var;
        Uri uri2;
        String str10;
        String str11;
        ze6 ze6Var;
        String str12;
        C1552a c1552a = this.f20244f;
        nn1 nn1Var = c1552a.f20262f;
        un1 un1Var = c1552a.f20261e;
        nm7 nm7Var = c1552a.f20258b;
        C3244l c3244l = c1552a.f20265i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f20242d;
        String str13 = this.f20245g;
        int i5 = 1;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            this.f20242d = 1;
            if (AbstractC3208a.m15437d(this.f20243e, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i4 == 2) {
                AbstractC3193b.m15359b(obj);
                i5 = 1;
                objM15541t = obj;
                str = ((Login) objM15541t).f19647b;
                if (str != null || str.length() == 0) {
                    i = i5;
                } else {
                    i = 0;
                }
                i2 = i ^ i5;
                qm7 qm7Var = ((C1369b) nm7Var).f18480m;
                this.f20241c = i2;
                this.f20242d = 3;
                objM15541t2 = AbstractC3224d.m15541t(qm7Var, this);
                if (objM15541t2 != coroutineSingletons) {
                    String str14 = ((Profile) objM15541t2).f19654c;
                    u32Var = new u32(str13, c1552a.f20257a.mo4589b2(), i2 != 0 ? i5 : 0);
                    str14.getClass();
                    u32Var.f63343d = str14;
                    vi7 vi7Var = ((C1368a) c1552a.f20259c).f18356L0;
                    this.f20239a = u32Var;
                    this.f20240b = u32Var;
                    this.f20241c = i2;
                    this.f20242d = 4;
                    objM15541t3 = AbstractC3224d.m15541t(vi7Var, this);
                    if (objM15541t3 != coroutineSingletons) {
                        u32Var2 = u32Var;
                        i3 = i2;
                    }
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                int i6 = this.f20241c;
                AbstractC3193b.m15359b(obj);
                i5 = 1;
                i2 = i6;
                objM15541t2 = obj;
                String str15 = ((Profile) objM15541t2).f19654c;
                u32Var = new u32(str13, c1552a.f20257a.mo4589b2(), i2 != 0 ? i5 : 0);
                str15.getClass();
                u32Var.f63343d = str15;
                vi7 vi7Var2 = ((C1368a) c1552a.f20259c).f18356L0;
                this.f20239a = u32Var;
                this.f20240b = u32Var;
                this.f20241c = i2;
                this.f20242d = 4;
                objM15541t3 = AbstractC3224d.m15541t(vi7Var2, this);
                if (objM15541t3 != coroutineSingletons) {
                    u32Var2 = u32Var;
                    i3 = i2;
                }
                return coroutineSingletons;
            }
            if (i4 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.f20241c;
            u32Var2 = this.f20240b;
            u32 u32Var3 = this.f20239a;
            AbstractC3193b.m15359b(obj);
            u32Var = u32Var3;
            objM15541t3 = obj;
        }
        String str16 = (String) objM15541t3;
        u32Var2.getClass();
        str16.getClass();
        u32Var2.f63344e = str16;
        tadVarM22429b = u32Var.m22429b();
        if (tadVarM22429b instanceof k42) {
            se6 se6Var = new se6(((k42) tadVarM22429b).f46688a);
            c3244l.getClass();
            c3244l.m15572j(null, se6Var);
        } else if (tadVarM22429b instanceof o42) {
            str12 = ((o42) tadVarM22429b).f53819a;
            if (str12 != null) {
                wfb.m23926u(un1Var, nn1Var, null, new DeepLinkControllerImpl$getFinalRedirectedUrl$1(c1552a, str12, null), 2);
            }
        } else if (tadVarM22429b instanceof l42) {
            te6 te6Var = new te6(((l42) tadVarM22429b).f49013a);
            c3244l.getClass();
            c3244l.m15572j(null, te6Var);
        } else if (tadVarM22429b instanceof p42) {
            p42 p42Var = (p42) tadVarM22429b;
            str10 = p42Var.f55546a;
            str11 = p42Var.f55547b;
            ze6Var = new ze6(p42Var.f55548c, p42Var.f55549d);
            if (str11 != null || vk9.m23391n0(str11)) {
                c1552a.m8246a(str10, ze6Var);
            } else {
                c1552a.m8246a(str10, new ge6(str11, ze6Var));
            }
        } else if (tadVarM22429b instanceof x32) {
            x32Var = (x32) tadVarM22429b;
            uri2 = x32Var.f67698a;
            if (uri2 != null) {
                c1552a.m8246a(x32Var.f67699b, new fe6(uri2));
            }
        } else if (tadVarM22429b instanceof y32) {
            y32Var = (y32) tadVarM22429b;
            uri = y32Var.f69207a;
            if (uri != null) {
                c1552a.m8246a(y32Var.f69208b, new ee6(uri));
            }
        } else if (tadVarM22429b instanceof r42) {
            r42 r42Var = (r42) tadVarM22429b;
            c1552a.m8246a(r42Var.f58597a, new ef6(r42Var.f58598b));
        } else if (tadVarM22429b instanceof h42) {
            h42Var = (h42) tadVarM22429b;
            str9 = h42Var.f41767a;
            num2 = h42Var.f41768b;
            if (str9 != null && num2 != null) {
                c1552a.m8246a(str9, new oe6(num2.intValue(), 8, null, h42Var.f41769c, h42Var.f41770d));
            }
        } else {
            z = tadVarM22429b instanceof i42;
            pe6Var = pe6.f56006a;
            if (z) {
                c1552a.m8246a(((i42) tadVarM22429b).f43476a, pe6Var);
            } else if (tadVarM22429b instanceof q42) {
                q42Var = (q42) tadVarM22429b;
                if (q42Var.f57248b) {
                    c1552a.mo8243R1(new cf6(new Regex("/accounts/subscription/(?=\\?|$)").m15428g(cl9.m4839V(q42Var.f57249c, "/checkout/", "/checkout"), "/accounts/subscription")));
                } else {
                    c1552a.mo8243R1(new df6(q42Var.f57247a));
                }
            } else if (tadVarM22429b instanceof j42) {
                c1552a.mo8243R1(new re6(((j42) tadVarM22429b).f45037a));
            } else if (tadVarM22429b instanceof n42) {
                c3244l.getClass();
                c3244l.m15572j(null, pe6Var);
                n42Var = (n42) tadVarM22429b;
                str8 = n42Var.f52312a;
                if (str8 != null) {
                    c1552a.m8246a(str8, new xe6(n42Var.f52313b, str8));
                }
            } else if (tadVarM22429b instanceof z32) {
                c3244l.getClass();
                c3244l.m15572j(null, pe6Var);
                z32 z32Var = (z32) tadVarM22429b;
                str6 = z32Var.f70826a;
                str7 = z32Var.f70827b;
                if (str6 != null && str7 != null) {
                    c1552a.m8246a(str6, new bf6(str6, str7));
                }
            } else if (tadVarM22429b instanceof a42) {
                a42 a42Var = (a42) tadVarM22429b;
                str5 = a42Var.f199a;
                num = a42Var.f200b;
                if (str5 != null && num != null) {
                    c1552a.m8246a(str5, new je6(num.intValue()));
                }
            } else if (tadVarM22429b instanceof b42) {
                b42Var = (b42) tadVarM22429b;
                str4 = b42Var.f7907a;
                if (str4 != null) {
                    c1552a.m8246a(str4, new ke6(str4, b42Var.f7908b));
                }
            } else if (tadVarM22429b instanceof f42) {
                c3244l.getClass();
                c3244l.m15572j(null, pe6Var);
                c1552a.m8246a(((f42) tadVarM22429b).f38388a, me6.f51207a);
            } else if (tadVarM22429b instanceof t42) {
                c3244l.getClass();
                c3244l.m15572j(null, pe6Var);
                c1552a.mo8243R1(new gf6(((t42) tadVarM22429b).f61848b));
            } else if (tadVarM22429b instanceof g42) {
                c3244l.getClass();
                c3244l.m15572j(null, pe6Var);
                g42 g42Var = (g42) tadVarM22429b;
                str2 = g42Var.f40162a;
                str3 = g42Var.f40163b;
                ne6Var = ne6.f52644a;
                if (str3 != null || vk9.m23391n0(str3)) {
                    c1552a.m8246a(str2, ne6Var);
                } else {
                    c1552a.m8246a(str2, new ge6(str3, ne6Var));
                }
            } else if (tadVarM22429b instanceof m42) {
                c1552a.m8246a(((m42) tadVarM22429b).f50562a, new qe6(ue6.f63810a));
            } else if (tadVarM22429b instanceof d42) {
                c1552a.m8246a(((d42) tadVarM22429b).f34981a, new qe6(new le6(new ImportData(null, null, null, null))));
            } else if (tadVarM22429b instanceof s42) {
                wfb.m23926u(un1Var, nn1Var, null, new C15515(c1552a, (s42) tadVarM22429b, null), 2);
                if (i3 == 0) {
                    te6 te6Var2 = new te6(str13);
                    c3244l.getClass();
                    c3244l.m15572j(null, te6Var2);
                }
            } else if (tadVarM22429b instanceof e42) {
                c3244l.getClass();
                c3244l.m15572j(null, we6.f66723a);
            } else if (AbstractC3352my.m17089H(str13)) {
                c1552a.mo8243R1(new cf6(str13));
            } else {
                c1552a.mo8243R1(ve6.f65273a);
            }
        }
        return xfa.f68157a;
        qm7 qm7Var2 = ((C1369b) nm7Var).f18482o;
        this.f20242d = 2;
        objM15541t = AbstractC3224d.m15541t(qm7Var2, this);
        if (objM15541t != coroutineSingletons) {
            str = ((Login) objM15541t).f19647b;
            if (str != null) {
                i = i5;
            } else {
                i = i5;
            }
            i2 = i ^ i5;
            qm7 qm7Var3 = ((C1369b) nm7Var).f18480m;
            this.f20241c = i2;
            this.f20242d = 3;
            objM15541t2 = AbstractC3224d.m15541t(qm7Var3, this);
            if (objM15541t2 != coroutineSingletons) {
                String str17 = ((Profile) objM15541t2).f19654c;
                u32Var = new u32(str13, c1552a.f20257a.mo4589b2(), i2 != 0 ? i5 : 0);
                str17.getClass();
                u32Var.f63343d = str17;
                vi7 vi7Var3 = ((C1368a) c1552a.f20259c).f18356L0;
                this.f20239a = u32Var;
                this.f20240b = u32Var;
                this.f20241c = i2;
                this.f20242d = 4;
                objM15541t3 = AbstractC3224d.m15541t(vi7Var3, this);
                if (objM15541t3 != coroutineSingletons) {
                    u32Var2 = u32Var;
                    i3 = i2;
                    String str18 = (String) objM15541t3;
                    u32Var2.getClass();
                    str18.getClass();
                    u32Var2.f63344e = str18;
                    tadVarM22429b = u32Var.m22429b();
                    if (tadVarM22429b instanceof k42) {
                        se6 se6Var2 = new se6(((k42) tadVarM22429b).f46688a);
                        c3244l.getClass();
                        c3244l.m15572j(null, se6Var2);
                    } else if (tadVarM22429b instanceof o42) {
                        str12 = ((o42) tadVarM22429b).f53819a;
                        if (str12 != null) {
                            wfb.m23926u(un1Var, nn1Var, null, new DeepLinkControllerImpl$getFinalRedirectedUrl$1(c1552a, str12, null), 2);
                        }
                    } else if (tadVarM22429b instanceof l42) {
                        te6 te6Var3 = new te6(((l42) tadVarM22429b).f49013a);
                        c3244l.getClass();
                        c3244l.m15572j(null, te6Var3);
                    } else if (tadVarM22429b instanceof p42) {
                        p42 p42Var2 = (p42) tadVarM22429b;
                        str10 = p42Var2.f55546a;
                        str11 = p42Var2.f55547b;
                        ze6Var = new ze6(p42Var2.f55548c, p42Var2.f55549d);
                        if (str11 != null) {
                            c1552a.m8246a(str10, ze6Var);
                        } else {
                            c1552a.m8246a(str10, ze6Var);
                        }
                    } else if (tadVarM22429b instanceof x32) {
                        x32Var = (x32) tadVarM22429b;
                        uri2 = x32Var.f67698a;
                        if (uri2 != null) {
                            c1552a.m8246a(x32Var.f67699b, new fe6(uri2));
                        }
                    } else if (tadVarM22429b instanceof y32) {
                        y32Var = (y32) tadVarM22429b;
                        uri = y32Var.f69207a;
                        if (uri != null) {
                            c1552a.m8246a(y32Var.f69208b, new ee6(uri));
                        }
                    } else if (tadVarM22429b instanceof r42) {
                        r42 r42Var2 = (r42) tadVarM22429b;
                        c1552a.m8246a(r42Var2.f58597a, new ef6(r42Var2.f58598b));
                    } else if (tadVarM22429b instanceof h42) {
                        h42Var = (h42) tadVarM22429b;
                        str9 = h42Var.f41767a;
                        num2 = h42Var.f41768b;
                        if (str9 != null) {
                            c1552a.m8246a(str9, new oe6(num2.intValue(), 8, null, h42Var.f41769c, h42Var.f41770d));
                        }
                    } else {
                        z = tadVarM22429b instanceof i42;
                        pe6Var = pe6.f56006a;
                        if (z) {
                            c1552a.m8246a(((i42) tadVarM22429b).f43476a, pe6Var);
                        } else if (tadVarM22429b instanceof q42) {
                            q42Var = (q42) tadVarM22429b;
                            if (q42Var.f57248b) {
                                c1552a.mo8243R1(new cf6(new Regex("/accounts/subscription/(?=\\?|$)").m15428g(cl9.m4839V(q42Var.f57249c, "/checkout/", "/checkout"), "/accounts/subscription")));
                            } else {
                                c1552a.mo8243R1(new df6(q42Var.f57247a));
                            }
                        } else if (tadVarM22429b instanceof j42) {
                            c1552a.mo8243R1(new re6(((j42) tadVarM22429b).f45037a));
                        } else if (tadVarM22429b instanceof n42) {
                            c3244l.getClass();
                            c3244l.m15572j(null, pe6Var);
                            n42Var = (n42) tadVarM22429b;
                            str8 = n42Var.f52312a;
                            if (str8 != null) {
                                c1552a.m8246a(str8, new xe6(n42Var.f52313b, str8));
                            }
                        } else if (tadVarM22429b instanceof z32) {
                            c3244l.getClass();
                            c3244l.m15572j(null, pe6Var);
                            z32 z32Var2 = (z32) tadVarM22429b;
                            str6 = z32Var2.f70826a;
                            str7 = z32Var2.f70827b;
                            if (str6 != null) {
                                c1552a.m8246a(str6, new bf6(str6, str7));
                            }
                        } else if (tadVarM22429b instanceof a42) {
                            a42 a42Var2 = (a42) tadVarM22429b;
                            str5 = a42Var2.f199a;
                            num = a42Var2.f200b;
                            if (str5 != null) {
                                c1552a.m8246a(str5, new je6(num.intValue()));
                            }
                        } else if (tadVarM22429b instanceof b42) {
                            b42Var = (b42) tadVarM22429b;
                            str4 = b42Var.f7907a;
                            if (str4 != null) {
                                c1552a.m8246a(str4, new ke6(str4, b42Var.f7908b));
                            }
                        } else if (tadVarM22429b instanceof f42) {
                            c3244l.getClass();
                            c3244l.m15572j(null, pe6Var);
                            c1552a.m8246a(((f42) tadVarM22429b).f38388a, me6.f51207a);
                        } else if (tadVarM22429b instanceof t42) {
                            c3244l.getClass();
                            c3244l.m15572j(null, pe6Var);
                            c1552a.mo8243R1(new gf6(((t42) tadVarM22429b).f61848b));
                        } else if (tadVarM22429b instanceof g42) {
                            c3244l.getClass();
                            c3244l.m15572j(null, pe6Var);
                            g42 g42Var2 = (g42) tadVarM22429b;
                            str2 = g42Var2.f40162a;
                            str3 = g42Var2.f40163b;
                            ne6Var = ne6.f52644a;
                            if (str3 != null) {
                                c1552a.m8246a(str2, ne6Var);
                            } else {
                                c1552a.m8246a(str2, ne6Var);
                            }
                        } else if (tadVarM22429b instanceof m42) {
                            c1552a.m8246a(((m42) tadVarM22429b).f50562a, new qe6(ue6.f63810a));
                        } else if (tadVarM22429b instanceof d42) {
                            c1552a.m8246a(((d42) tadVarM22429b).f34981a, new qe6(new le6(new ImportData(null, null, null, null))));
                        } else if (tadVarM22429b instanceof s42) {
                            wfb.m23926u(un1Var, nn1Var, null, new C15515(c1552a, (s42) tadVarM22429b, null), 2);
                            if (i3 == 0) {
                                te6 te6Var4 = new te6(str13);
                                c3244l.getClass();
                                c3244l.m15572j(null, te6Var4);
                            }
                        } else if (tadVarM22429b instanceof e42) {
                            c3244l.getClass();
                            c3244l.m15572j(null, we6.f66723a);
                        } else if (AbstractC3352my.m17089H(str13)) {
                            c1552a.mo8243R1(new cf6(str13));
                        } else {
                            c1552a.mo8243R1(ve6.f65273a);
                        }
                    }
                    return xfa.f68157a;
                }
            }
        }
        return coroutineSingletons;
    }
}
