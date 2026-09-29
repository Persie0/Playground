package com.lingq.core.domain.web2wave;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.data.repository.C1309y;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.C1372e;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3845zt;
import p000.C3386nv;
import p000.C3623tt;
import p000.C3660ut;
import p000.C3697vt;
import p000.C3734wt;
import p000.C3771xt;
import p000.c83;
import p000.gm5;
import p000.km7;
import p000.nm7;
import p000.pk9;
import p000.q2b;
import p000.qm7;
import p000.s2b;
import p000.vk9;
import p000.xm5;
import p000.ym5;
import p000.z2b;

/* JADX INFO: renamed from: com.lingq.core.domain.web2wave.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1544a {

    /* JADX INFO: renamed from: a */
    public final C1309y f20171a;

    /* JADX INFO: renamed from: b */
    public final s2b f20172b;

    /* JADX INFO: renamed from: c */
    public final km7 f20173c;

    /* JADX INFO: renamed from: d */
    public final nm7 f20174d;

    public C1544a(C1309y c1309y, s2b s2bVar, km7 km7Var, nm7 nm7Var) {
        c1309y.getClass();
        s2bVar.getClass();
        km7Var.getClass();
        nm7Var.getClass();
        this.f20171a = c1309y;
        this.f20172b = s2bVar;
        this.f20173c = km7Var;
        this.f20174d = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c6 A[PHI: r11
      0x01c6: PHI (r11v52 java.lang.Object) = (r11v51 java.lang.Object), (r11v1 java.lang.Object) binds: [B:103:0x01c3, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[PHI: r2 r11
      0x009f: PHI (r2v3 com.lingq.core.domain.store.Web2WaveDeferredLoginStatus) = 
      (r2v2 com.lingq.core.domain.store.Web2WaveDeferredLoginStatus)
      (r2v8 com.lingq.core.domain.store.Web2WaveDeferredLoginStatus)
     binds: [B:29:0x009b, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v1 java.lang.Object) binds: [B:29:0x009b, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec A[PHI: r11
      0x00ec: PHI (r11v38 java.lang.Object) = (r11v24 java.lang.Object), (r11v1 java.lang.Object) binds: [B:53:0x00e8, B:18:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012f A[PHI: r11
      0x012f: PHI (r11v26 java.lang.Object) = (r11v16 java.lang.Object), (r11v1 java.lang.Object) binds: [B:67:0x012b, B:21:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b A[PHI: r2
      0x015b: PHI (r2v15 java.lang.String) = 
      (r2v9 java.lang.String)
      (r2v9 java.lang.String)
      (r2v12 java.lang.String)
      (r2v14 java.lang.String)
      (r2v16 java.lang.String)
     binds: [B:76:0x0146, B:78:0x0157, B:65:0x011f, B:60:0x0109, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:87:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c A[PHI: r11
      0x018c: PHI (r11v46 java.lang.Object) = (r11v44 java.lang.Object), (r11v1 java.lang.Object) binds: [B:88:0x0188, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f3, code lost:
    
        if (((com.lingq.core.datastore.C1372e) r7).m7976b(r2, r0) == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (((com.lingq.core.datastore.C1372e) r7).m7976b(r10, r0) == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        if (r11 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0173, code lost:
    
        if (((com.lingq.core.datastore.C1372e) r7).m7976b(r10, r0) == r1) goto L114;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8228a(ContinuationImpl continuationImpl) throws Throwable {
        ApplyWeb2WaveDeferredLoginUseCase$invoke$1 applyWeb2WaveDeferredLoginUseCase$invoke$1;
        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus;
        String str;
        int i;
        q2b q2bVar;
        String str2;
        String str3;
        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus2;
        z2b z2bVar;
        String strM25421b;
        String strM25420a;
        Object obj;
        xm5 xm5Var;
        String str4;
        if (continuationImpl instanceof ApplyWeb2WaveDeferredLoginUseCase$invoke$1) {
            applyWeb2WaveDeferredLoginUseCase$invoke$1 = (ApplyWeb2WaveDeferredLoginUseCase$invoke$1) continuationImpl;
            int i2 = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = i2 - Integer.MIN_VALUE;
            } else {
                applyWeb2WaveDeferredLoginUseCase$invoke$1 = new ApplyWeb2WaveDeferredLoginUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            applyWeb2WaveDeferredLoginUseCase$invoke$1 = new ApplyWeb2WaveDeferredLoginUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20164e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g;
        C1309y c1309y = this.f20171a;
        s2b s2bVar = this.f20172b;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                c83 c83Var = ((C1372e) s2bVar).f18597h;
                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                if (objM15541t != coroutineSingletons) {
                    web2WaveDeferredLoginStatus = (Web2WaveDeferredLoginStatus) objM15541t;
                    qm7 qm7Var = ((C1369b) this.f20174d).f18482o;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = web2WaveDeferredLoginStatus;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 2;
                    objM15541t = AbstractC3224d.m15541t(qm7Var, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        str = ((Login) objM15541t).f19647b;
                        if (str == null && !vk9.m23391n0(str)) {
                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus3 = Web2WaveDeferredLoginStatus.COMPLETED;
                            if (web2WaveDeferredLoginStatus != web2WaveDeferredLoginStatus3) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 3;
                                break;
                            }
                            return C3623tt.f62836a;
                        }
                        i = AbstractC3845zt.f72115a[web2WaveDeferredLoginStatus.ordinal()];
                        if (i != 1) {
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 4;
                            objM15541t = c1309y.m7422c(applyWeb2WaveDeferredLoginUseCase$invoke$1);
                            if (objM15541t != coroutineSingletons) {
                                q2bVar = (q2b) pk9.m19381x((ym5) objM15541t);
                                if (q2bVar != null) {
                                    str2 = q2bVar.f57173a;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    str3 = str2;
                                    if (!vk9.m23391n0(str3)) {
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = str3;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 5;
                                        if (((C1372e) s2bVar).m7975a(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                            if (vk9.m23391n0(str3)) {
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                                objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                if (objM15541t != coroutineSingletons) {
                                                    z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                                    if (z2bVar != null) {
                                                        strM25421b = z2bVar.m25421b();
                                                        strM25420a = z2bVar.m25420a();
                                                        if (strM25421b != null) {
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                            objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                            if (objM15541t != coroutineSingletons) {
                                                                obj = (ym5) objM15541t;
                                                                if (obj instanceof xm5) {
                                                                    xm5Var = (xm5) obj;
                                                                    str4 = ((Login) xm5Var.f68348a).f19647b;
                                                                    if (str4 != null) {
                                                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus4 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus5 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                            }
                                        }
                                    } else if (vk9.m23391n0(str3)) {
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                        objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                        if (objM15541t != coroutineSingletons) {
                                            z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                            if (z2bVar != null) {
                                                strM25421b = z2bVar.m25421b();
                                                strM25420a = z2bVar.m25420a();
                                                if (strM25421b != null) {
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                    objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                    if (objM15541t != coroutineSingletons) {
                                                        obj = (ym5) objM15541t;
                                                        if (obj instanceof xm5) {
                                                            xm5Var = (xm5) obj;
                                                            str4 = ((Login) xm5Var.f68348a).f19647b;
                                                            if (str4 != null) {
                                                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus6 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus7 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                    }
                                    break;
                                }
                                return C3734wt.f67262a;
                            }
                        } else {
                            if (i != 2) {
                                if (i == 3) {
                                    c83 c83Var2 = ((C1372e) s2bVar).f18595f;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 7;
                                    objM15541t = AbstractC3224d.m15541t(c83Var2, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                    if (objM15541t != coroutineSingletons) {
                                        str3 = (String) objM15541t;
                                        if (!vk9.m23391n0(str3)) {
                                            web2WaveDeferredLoginStatus2 = Web2WaveDeferredLoginStatus.IDENTIFIED;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = str3;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 8;
                                            if (((C1372e) s2bVar).m7976b(web2WaveDeferredLoginStatus2, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                                if (vk9.m23391n0(str3)) {
                                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus8 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                                } else {
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                                    objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                    if (objM15541t != coroutineSingletons) {
                                                        z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                                        if (z2bVar != null) {
                                                            strM25421b = z2bVar.m25421b();
                                                            strM25420a = z2bVar.m25420a();
                                                            if (strM25421b != null && !vk9.m23391n0(strM25421b) && strM25420a != null && !vk9.m23391n0(strM25420a)) {
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                                objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                                if (objM15541t != coroutineSingletons) {
                                                                    obj = (ym5) objM15541t;
                                                                    if (obj instanceof xm5) {
                                                                        xm5Var = (xm5) obj;
                                                                        str4 = ((Login) xm5Var.f68348a).f19647b;
                                                                        if (str4 != null && !vk9.m23391n0(str4)) {
                                                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus9 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        return C3734wt.f67262a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } else if (i != 4 && i != 5) {
                                    gm5.m12750e();
                                    return null;
                                }
                                return C3771xt.f68673a;
                            }
                            c83 c83Var3 = ((C1372e) s2bVar).f18595f;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 6;
                            objM15541t = AbstractC3224d.m15541t(c83Var3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(objM15541t);
                web2WaveDeferredLoginStatus = (Web2WaveDeferredLoginStatus) objM15541t;
                qm7 qm7Var2 = ((C1369b) this.f20174d).f18482o;
                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = web2WaveDeferredLoginStatus;
                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 2;
                objM15541t = AbstractC3224d.m15541t(qm7Var2, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                if (objM15541t != coroutineSingletons) {
                    str = ((Login) objM15541t).f19647b;
                    if (str == null) {
                    }
                    i = AbstractC3845zt.f72115a[web2WaveDeferredLoginStatus.ordinal()];
                    if (i != 1) {
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 4;
                        objM15541t = c1309y.m7422c(applyWeb2WaveDeferredLoginUseCase$invoke$1);
                        if (objM15541t != coroutineSingletons) {
                            q2bVar = (q2b) pk9.m19381x((ym5) objM15541t);
                            if (q2bVar != null) {
                                str2 = q2bVar.f57173a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                str3 = str2;
                                if (!vk9.m23391n0(str3)) {
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = str3;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 5;
                                    if (((C1372e) s2bVar).m7975a(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                        if (vk9.m23391n0(str3)) {
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                            objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                            if (objM15541t != coroutineSingletons) {
                                                z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                                if (z2bVar != null) {
                                                    strM25421b = z2bVar.m25421b();
                                                    strM25420a = z2bVar.m25420a();
                                                    if (strM25421b != null) {
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                        objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                        if (objM15541t != coroutineSingletons) {
                                                            obj = (ym5) objM15541t;
                                                            if (obj instanceof xm5) {
                                                                xm5Var = (xm5) obj;
                                                                str4 = ((Login) xm5Var.f68348a).f19647b;
                                                                if (str4 != null) {
                                                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus10 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus11 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                        }
                                    }
                                } else if (vk9.m23391n0(str3)) {
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                    objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                    if (objM15541t != coroutineSingletons) {
                                        z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                        if (z2bVar != null) {
                                            strM25421b = z2bVar.m25421b();
                                            strM25420a = z2bVar.m25420a();
                                            if (strM25421b != null) {
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                if (objM15541t != coroutineSingletons) {
                                                    obj = (ym5) objM15541t;
                                                    if (obj instanceof xm5) {
                                                        xm5Var = (xm5) obj;
                                                        str4 = ((Login) xm5Var.f68348a).f19647b;
                                                        if (str4 != null) {
                                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus12 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus13 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                }
                                break;
                            }
                            return C3734wt.f67262a;
                        }
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                c83 c83Var4 = ((C1372e) s2bVar).f18595f;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 7;
                                objM15541t = AbstractC3224d.m15541t(c83Var4, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    str3 = (String) objM15541t;
                                    if (!vk9.m23391n0(str3)) {
                                        web2WaveDeferredLoginStatus2 = Web2WaveDeferredLoginStatus.IDENTIFIED;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = str3;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 8;
                                        if (((C1372e) s2bVar).m7976b(web2WaveDeferredLoginStatus2, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                            if (vk9.m23391n0(str3)) {
                                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus14 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                            } else {
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                                objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                if (objM15541t != coroutineSingletons) {
                                                    z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                                    if (z2bVar != null) {
                                                        strM25421b = z2bVar.m25421b();
                                                        strM25420a = z2bVar.m25420a();
                                                        if (strM25421b != null) {
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                            objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                            if (objM15541t != coroutineSingletons) {
                                                                obj = (ym5) objM15541t;
                                                                if (obj instanceof xm5) {
                                                                    xm5Var = (xm5) obj;
                                                                    str4 = ((Login) xm5Var.f68348a).f19647b;
                                                                    if (str4 != null) {
                                                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus15 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    return C3734wt.f67262a;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            } else if (i != 4) {
                                gm5.m12750e();
                                return null;
                            }
                            return C3771xt.f68673a;
                        }
                        c83 c83Var5 = ((C1372e) s2bVar).f18595f;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 6;
                        objM15541t = AbstractC3224d.m15541t(c83Var5, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                web2WaveDeferredLoginStatus = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a;
                AbstractC3193b.m15359b(objM15541t);
                str = ((Login) objM15541t).f19647b;
                if (str == null) {
                    break;
                }
                i = AbstractC3845zt.f72115a[web2WaveDeferredLoginStatus.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c83 c83Var6 = ((C1372e) s2bVar).f18595f;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 7;
                            objM15541t = AbstractC3224d.m15541t(c83Var6, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                            if (objM15541t != coroutineSingletons) {
                                str3 = (String) objM15541t;
                                if (!vk9.m23391n0(str3)) {
                                    web2WaveDeferredLoginStatus2 = Web2WaveDeferredLoginStatus.IDENTIFIED;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = str3;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 8;
                                    if (((C1372e) s2bVar).m7976b(web2WaveDeferredLoginStatus2, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                        if (vk9.m23391n0(str3)) {
                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus16 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                        } else {
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                            objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                            if (objM15541t != coroutineSingletons) {
                                                z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                                if (z2bVar != null) {
                                                    strM25421b = z2bVar.m25421b();
                                                    strM25420a = z2bVar.m25420a();
                                                    if (strM25421b != null) {
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                        objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                        if (objM15541t != coroutineSingletons) {
                                                            obj = (ym5) objM15541t;
                                                            if (obj instanceof xm5) {
                                                                xm5Var = (xm5) obj;
                                                                str4 = ((Login) xm5Var.f68348a).f19647b;
                                                                if (str4 != null) {
                                                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus17 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                return C3734wt.f67262a;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        } else if (i != 4) {
                            gm5.m12750e();
                            return null;
                        }
                        return C3771xt.f68673a;
                    }
                    c83 c83Var7 = ((C1372e) s2bVar).f18595f;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 6;
                    objM15541t = AbstractC3224d.m15541t(c83Var7, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    break;
                } else {
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 4;
                    objM15541t = c1309y.m7422c(applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        q2bVar = (q2b) pk9.m19381x((ym5) objM15541t);
                        if (q2bVar != null) {
                            str2 = q2bVar.f57173a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            str3 = str2;
                            if (!vk9.m23391n0(str3)) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = str3;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 5;
                                if (((C1372e) s2bVar).m7975a(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                                    if (vk9.m23391n0(str3)) {
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                        objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                        if (objM15541t != coroutineSingletons) {
                                            z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                            if (z2bVar != null) {
                                                strM25421b = z2bVar.m25421b();
                                                strM25420a = z2bVar.m25420a();
                                                if (strM25421b != null) {
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                                    objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                                    if (objM15541t != coroutineSingletons) {
                                                        obj = (ym5) objM15541t;
                                                        if (obj instanceof xm5) {
                                                            xm5Var = (xm5) obj;
                                                            str4 = ((Login) xm5Var.f68348a).f19647b;
                                                            if (str4 != null) {
                                                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus18 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus19 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                                    }
                                }
                            } else if (vk9.m23391n0(str3)) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                    if (z2bVar != null) {
                                        strM25421b = z2bVar.m25421b();
                                        strM25420a = z2bVar.m25420a();
                                        if (strM25421b != null) {
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                            objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                            if (objM15541t != coroutineSingletons) {
                                                obj = (ym5) objM15541t;
                                                if (obj instanceof xm5) {
                                                    xm5Var = (xm5) obj;
                                                    str4 = ((Login) xm5Var.f68348a).f19647b;
                                                    if (str4 != null) {
                                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus110 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus111 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                            }
                            break;
                        }
                        return C3734wt.f67262a;
                    }
                }
                return coroutineSingletons;
            case 3:
                AbstractC3193b.m15359b(objM15541t);
                return C3623tt.f62836a;
            case 4:
                AbstractC3193b.m15359b(objM15541t);
                q2bVar = (q2b) pk9.m19381x((ym5) objM15541t);
                if (q2bVar != null) {
                    str2 = q2bVar.f57173a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str3 = str2;
                    if (!vk9.m23391n0(str3)) {
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = str3;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 5;
                        if (((C1372e) s2bVar).m7975a(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                            if (vk9.m23391n0(str3)) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                                objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                    if (z2bVar != null) {
                                        strM25421b = z2bVar.m25421b();
                                        strM25420a = z2bVar.m25420a();
                                        if (strM25421b != null) {
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                            objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                            if (objM15541t != coroutineSingletons) {
                                                obj = (ym5) objM15541t;
                                                if (obj instanceof xm5) {
                                                    xm5Var = (xm5) obj;
                                                    str4 = ((Login) xm5Var.f68348a).f19647b;
                                                    if (str4 != null) {
                                                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus112 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus113 = Web2WaveDeferredLoginStatus.NO_MATCH;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                            }
                        }
                        break;
                    } else {
                        if (vk9.m23391n0(str3)) {
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                            objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                            if (objM15541t != coroutineSingletons) {
                                z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                if (z2bVar != null) {
                                    strM25421b = z2bVar.m25421b();
                                    strM25420a = z2bVar.m25420a();
                                    if (strM25421b != null) {
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                        objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                        if (objM15541t != coroutineSingletons) {
                                            obj = (ym5) objM15541t;
                                            if (obj instanceof xm5) {
                                                xm5Var = (xm5) obj;
                                                str4 = ((Login) xm5Var.f68348a).f19647b;
                                                if (str4 != null) {
                                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus114 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus115 = Web2WaveDeferredLoginStatus.NO_MATCH;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                return C3734wt.f67262a;
            case 5:
                str3 = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c;
                AbstractC3193b.m15359b(objM15541t);
                if (vk9.m23391n0(str3)) {
                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus116 = Web2WaveDeferredLoginStatus.NO_MATCH;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                    break;
                } else {
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                    objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                        if (z2bVar != null) {
                            strM25421b = z2bVar.m25421b();
                            strM25420a = z2bVar.m25420a();
                            if (strM25421b != null) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    obj = (ym5) objM15541t;
                                    if (obj instanceof xm5) {
                                        xm5Var = (xm5) obj;
                                        str4 = ((Login) xm5Var.f68348a).f19647b;
                                        if (str4 != null) {
                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus117 = Web2WaveDeferredLoginStatus.COMPLETED;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return C3734wt.f67262a;
                    }
                }
                return coroutineSingletons;
            case 6:
                AbstractC3193b.m15359b(objM15541t);
                str3 = (String) objM15541t;
                if (vk9.m23391n0(str3)) {
                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus118 = Web2WaveDeferredLoginStatus.NO_MATCH;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                    break;
                } else {
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                    objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                        if (z2bVar != null) {
                            strM25421b = z2bVar.m25421b();
                            strM25420a = z2bVar.m25420a();
                            if (strM25421b != null) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    obj = (ym5) objM15541t;
                                    if (obj instanceof xm5) {
                                        xm5Var = (xm5) obj;
                                        str4 = ((Login) xm5Var.f68348a).f19647b;
                                        if (str4 != null) {
                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus119 = Web2WaveDeferredLoginStatus.COMPLETED;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return C3734wt.f67262a;
                    }
                }
                return coroutineSingletons;
            case 7:
                AbstractC3193b.m15359b(objM15541t);
                str3 = (String) objM15541t;
                if (!vk9.m23391n0(str3)) {
                    web2WaveDeferredLoginStatus2 = Web2WaveDeferredLoginStatus.IDENTIFIED;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = str3;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 8;
                    if (((C1372e) s2bVar).m7976b(web2WaveDeferredLoginStatus2, applyWeb2WaveDeferredLoginUseCase$invoke$1) != coroutineSingletons) {
                        if (vk9.m23391n0(str3)) {
                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1110 = Web2WaveDeferredLoginStatus.NO_MATCH;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                        } else {
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                            objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                            if (objM15541t != coroutineSingletons) {
                                z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                                if (z2bVar != null) {
                                    strM25421b = z2bVar.m25421b();
                                    strM25420a = z2bVar.m25420a();
                                    if (strM25421b != null) {
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                        objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                        if (objM15541t != coroutineSingletons) {
                                            obj = (ym5) objM15541t;
                                            if (obj instanceof xm5) {
                                                xm5Var = (xm5) obj;
                                                str4 = ((Login) xm5Var.f68348a).f19647b;
                                                if (str4 != null) {
                                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1111 = Web2WaveDeferredLoginStatus.COMPLETED;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return C3734wt.f67262a;
                            }
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                return C3771xt.f68673a;
            case 8:
                str3 = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b;
                AbstractC3193b.m15359b(objM15541t);
                if (vk9.m23391n0(str3)) {
                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1112 = Web2WaveDeferredLoginStatus.NO_MATCH;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 9;
                    break;
                } else {
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 10;
                    objM15541t = c1309y.m7421b(str3, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                        if (z2bVar != null) {
                            strM25421b = z2bVar.m25421b();
                            strM25420a = z2bVar.m25420a();
                            if (strM25421b != null) {
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                                objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    obj = (ym5) objM15541t;
                                    if (obj instanceof xm5) {
                                        xm5Var = (xm5) obj;
                                        str4 = ((Login) xm5Var.f68348a).f19647b;
                                        if (str4 != null) {
                                            Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1113 = Web2WaveDeferredLoginStatus.COMPLETED;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                            applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return C3734wt.f67262a;
                    }
                }
                return coroutineSingletons;
            case 9:
                AbstractC3193b.m15359b(objM15541t);
                return C3697vt.f65870a;
            case 10:
                AbstractC3193b.m15359b(objM15541t);
                z2bVar = (z2b) pk9.m19381x((ym5) objM15541t);
                if (z2bVar != null) {
                    strM25421b = z2bVar.m25421b();
                    strM25420a = z2bVar.m25420a();
                    if (strM25421b != null) {
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 11;
                        objM15541t = ((C1267a) this.f20173c).m7079h(strM25420a, applyWeb2WaveDeferredLoginUseCase$invoke$1);
                        if (objM15541t != coroutineSingletons) {
                            obj = (ym5) objM15541t;
                            if (obj instanceof xm5) {
                                xm5Var = (xm5) obj;
                                str4 = ((Login) xm5Var.f68348a).f19647b;
                                if (str4 != null) {
                                    Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1114 = Web2WaveDeferredLoginStatus.COMPLETED;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                                    applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                                }
                            }
                            break;
                        }
                        return coroutineSingletons;
                    }
                }
                return C3734wt.f67262a;
            case 11:
                AbstractC3193b.m15359b(objM15541t);
                obj = (ym5) objM15541t;
                if (obj instanceof xm5) {
                    xm5Var = (xm5) obj;
                    str4 = ((Login) xm5Var.f68348a).f19647b;
                    if (str4 != null) {
                        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus1115 = Web2WaveDeferredLoginStatus.COMPLETED;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20160a = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20161b = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20162c = null;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d = xm5Var;
                        applyWeb2WaveDeferredLoginUseCase$invoke$1.f20166g = 12;
                    }
                    break;
                }
                return C3734wt.f67262a;
            case 12:
                obj = applyWeb2WaveDeferredLoginUseCase$invoke$1.f20163d;
                AbstractC3193b.m15359b(objM15541t);
                return new C3660ut((Login) ((xm5) obj).f68348a);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
