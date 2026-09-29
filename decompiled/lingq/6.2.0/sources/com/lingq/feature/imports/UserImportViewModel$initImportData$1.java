package com.lingq.feature.imports;

import com.lingq.core.datastore.C1368a;
import com.lingq.feature.imports.data.UserImportDefaults;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.ika;
import p000.jka;
import p000.si7;
import p000.u91;
import p000.un1;
import p000.vk9;
import p000.wi7;
import p000.xfa;
import p000.yi7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$initImportData$1", m4291f = "UserImportViewModel.kt", m4292l = {156, 157, 158, 159}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$initImportData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ika f26124a;

    /* JADX INFO: renamed from: b */
    public String f26125b;

    /* JADX INFO: renamed from: c */
    public String f26126c;

    /* JADX INFO: renamed from: d */
    public String f26127d;

    /* JADX INFO: renamed from: e */
    public int f26128e;

    /* JADX INFO: renamed from: f */
    public int f26129f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2109f f26130g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ UserImportSourceType f26131h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$initImportData$1(C2109f c2109f, UserImportSourceType userImportSourceType, Continuation continuation) {
        super(2, continuation);
        this.f26130g = c2109f;
        this.f26131h = userImportSourceType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$initImportData$1(this.f26130g, this.f26131h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$initImportData$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[PHI: r7 r8 r9 r11
      0x00ec: PHI (r7v6 java.lang.String) = (r7v3 java.lang.String), (r7v10 java.lang.String) binds: [B:34:0x00bf, B:42:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r8v8 java.lang.String) = (r8v6 java.lang.String), (r8v12 java.lang.String) binds: [B:34:0x00bf, B:42:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r9v10 java.lang.String) = (r9v8 java.lang.String), (r9v14 java.lang.String) binds: [B:34:0x00bf, B:42:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r11v12 ika) = (r11v10 ika), (r11v14 ika) binds: [B:34:0x00bf, B:42:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x015f  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x017c A[PHI: r0
      0x017c: PHI (r0v13 java.util.List) = (r0v12 java.util.List), (r0v16 java.util.List) binds: [B:92:0x016a, B:98:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r8 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r7 == r4) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ika ikaVar;
        String str;
        int i;
        Object objM15542u;
        String str2;
        Object objM15542u2;
        String str3;
        Object objM15542u3;
        Object objM15542u4;
        String str4;
        String str5;
        ika ikaVar2;
        List listM22622n1;
        String strMo4589b2;
        String str6;
        String str7;
        List list;
        List list2;
        Set set;
        C2109f c2109f = this.f26130g;
        jka jkaVar = c2109f.f26170b;
        si7 si7Var = c2109f.f26176h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f26129f;
        List list3 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            ika ikaVar3 = (ika) jkaVar.mo9014u2().getValue();
            boolean z = ikaVar3.f44246j;
            int i3 = !z ? 1 : 0;
            if (z) {
                ikaVar = ikaVar3;
                str = null;
                i = i3;
                if (i != 0) {
                    yi7 yi7Var = ((C1368a) si7Var).f18351J1;
                    this.f26124a = ikaVar;
                    this.f26125b = str;
                    this.f26128e = i;
                    this.f26129f = 2;
                    objM15542u2 = AbstractC3224d.m15542u(yi7Var, this);
                } else {
                    str2 = null;
                    if (i == 0) {
                        str3 = null;
                        if (i != 0) {
                            yi7 yi7Var2 = ((C1368a) si7Var).f18357L1;
                            this.f26124a = ikaVar;
                            this.f26125b = str;
                            this.f26126c = str2;
                            this.f26127d = str3;
                            this.f26128e = i;
                            this.f26129f = 4;
                            objM15542u4 = AbstractC3224d.m15542u(yi7Var2, this);
                            if (objM15542u4 != coroutineSingletons) {
                                str4 = str2;
                                str5 = str;
                                ikaVar2 = ikaVar;
                                set = (Set) objM15542u4;
                                if (set != null) {
                                    listM22622n1 = u91.m22622n1(set);
                                    str2 = str4;
                                    str = str5;
                                    ikaVar = ikaVar2;
                                } else {
                                    str2 = str4;
                                    str = str5;
                                    ikaVar = ikaVar2;
                                    listM22622n1 = null;
                                }
                            }
                        } else {
                            listM22622n1 = null;
                        }
                        String strName = this.f26131h.name();
                        strMo4589b2 = ikaVar.f44237a;
                        if (vk9.m23391n0(strMo4589b2)) {
                            strMo4589b2 = null;
                        }
                        if (strMo4589b2 == null) {
                            if (str != null) {
                                if (vk9.m23391n0(str)) {
                                    str = null;
                                }
                                strMo4589b2 = str;
                            } else {
                                strMo4589b2 = null;
                            }
                            if (strMo4589b2 == null) {
                                strMo4589b2 = c2109f.f26171c.mo4589b2();
                            }
                        }
                        String str8 = strMo4589b2;
                        str6 = ikaVar.f44239c;
                        if (vk9.m23391n0(str6)) {
                            str6 = null;
                        }
                        if (str6 == null) {
                            if (str2 != null) {
                                if (vk9.m23391n0(str2)) {
                                    str2 = null;
                                }
                                str6 = str2;
                            } else {
                                str6 = null;
                            }
                            if (str6 == null) {
                                str6 = UserImportDefaults.Course.getDefault();
                            }
                        }
                        String str9 = str6;
                        str7 = ikaVar.f44240d;
                        if (vk9.m23391n0(str7)) {
                            str7 = null;
                        }
                        if (str7 == null) {
                            if (str3 != null) {
                                if (vk9.m23391n0(str3)) {
                                    str3 = null;
                                }
                                str7 = str3;
                            } else {
                                str7 = null;
                            }
                            if (str7 == null) {
                                str7 = UserImportDefaults.Level.getDefault();
                            }
                        }
                        String str10 = str7;
                        list = ikaVar.f44245i;
                        if (!ikaVar.f44246j) {
                            list = null;
                        }
                        if (list != null) {
                            list2 = list;
                        } else {
                            if (listM22622n1 != null) {
                                list3 = listM22622n1;
                            }
                            if (list3 == null) {
                                list = EmptyList.f47638a;
                                list2 = list;
                            } else {
                                list2 = list3;
                            }
                        }
                        jkaVar.mo9011N0(ika.m13999a(ikaVar, str8, null, str9, str10, strName, null, null, null, list2, 226));
                        return xfa.f68157a;
                    }
                    yi7 yi7Var3 = ((C1368a) si7Var).f18354K1;
                    this.f26124a = ikaVar;
                    this.f26125b = str;
                    this.f26126c = str2;
                    this.f26128e = i;
                    this.f26129f = 3;
                    objM15542u3 = AbstractC3224d.m15542u(yi7Var3, this);
                }
            } else {
                wi7 wi7Var = ((C1368a) si7Var).f18348I1;
                this.f26124a = ikaVar3;
                this.f26128e = i3;
                this.f26129f = 1;
                objM15542u = AbstractC3224d.m15542u(wi7Var, this);
                if (objM15542u != coroutineSingletons) {
                    ikaVar = ikaVar3;
                    i = i3;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            i = this.f26128e;
            ika ikaVar4 = this.f26124a;
            AbstractC3193b.m15359b(obj);
            ikaVar = ikaVar4;
            objM15542u = obj;
        } else {
            if (i2 == 2) {
                i = this.f26128e;
                String str11 = this.f26125b;
                ika ikaVar5 = this.f26124a;
                AbstractC3193b.m15359b(obj);
                ikaVar = ikaVar5;
                str = str11;
                objM15542u2 = obj;
                str2 = (String) objM15542u2;
                if (i == 0) {
                    str3 = null;
                    if (i != 0) {
                        yi7 yi7Var4 = ((C1368a) si7Var).f18357L1;
                        this.f26124a = ikaVar;
                        this.f26125b = str;
                        this.f26126c = str2;
                        this.f26127d = str3;
                        this.f26128e = i;
                        this.f26129f = 4;
                        objM15542u4 = AbstractC3224d.m15542u(yi7Var4, this);
                        if (objM15542u4 != coroutineSingletons) {
                            str4 = str2;
                            str5 = str;
                            ikaVar2 = ikaVar;
                        }
                    } else {
                        listM22622n1 = null;
                    }
                    String strName2 = this.f26131h.name();
                    strMo4589b2 = ikaVar.f44237a;
                    if (vk9.m23391n0(strMo4589b2)) {
                        strMo4589b2 = null;
                    }
                    if (strMo4589b2 == null) {
                        if (str != null) {
                            if (vk9.m23391n0(str)) {
                                str = null;
                            }
                            strMo4589b2 = str;
                        } else {
                            strMo4589b2 = null;
                        }
                        if (strMo4589b2 == null) {
                            strMo4589b2 = c2109f.f26171c.mo4589b2();
                        }
                    }
                    String str12 = strMo4589b2;
                    str6 = ikaVar.f44239c;
                    if (vk9.m23391n0(str6)) {
                        str6 = null;
                    }
                    if (str6 == null) {
                        if (str2 != null) {
                            if (vk9.m23391n0(str2)) {
                                str2 = null;
                            }
                            str6 = str2;
                        } else {
                            str6 = null;
                        }
                        if (str6 == null) {
                            str6 = UserImportDefaults.Course.getDefault();
                        }
                    }
                    String str13 = str6;
                    str7 = ikaVar.f44240d;
                    if (vk9.m23391n0(str7)) {
                        str7 = null;
                    }
                    if (str7 == null) {
                        if (str3 != null) {
                            if (vk9.m23391n0(str3)) {
                                str3 = null;
                            }
                            str7 = str3;
                        } else {
                            str7 = null;
                        }
                        if (str7 == null) {
                            str7 = UserImportDefaults.Level.getDefault();
                        }
                    }
                    String str14 = str7;
                    list = ikaVar.f44245i;
                    if (!ikaVar.f44246j) {
                        list = null;
                    }
                    if (list != null) {
                        list2 = list;
                    } else {
                        if (listM22622n1 != null) {
                            list3 = listM22622n1;
                        }
                        if (list3 == null) {
                            list = EmptyList.f47638a;
                            list2 = list;
                        } else {
                            list2 = list3;
                        }
                    }
                    jkaVar.mo9011N0(ika.m13999a(ikaVar, str12, null, str13, str14, strName2, null, null, null, list2, 226));
                    return xfa.f68157a;
                }
                yi7 yi7Var5 = ((C1368a) si7Var).f18354K1;
                this.f26124a = ikaVar;
                this.f26125b = str;
                this.f26126c = str2;
                this.f26128e = i;
                this.f26129f = 3;
                objM15542u3 = AbstractC3224d.m15542u(yi7Var5, this);
                return coroutineSingletons;
            }
            if (i2 == 3) {
                i = this.f26128e;
                String str15 = this.f26126c;
                String str16 = this.f26125b;
                ika ikaVar6 = this.f26124a;
                AbstractC3193b.m15359b(obj);
                ikaVar = ikaVar6;
                str = str16;
                str2 = str15;
                objM15542u3 = obj;
                str3 = (String) objM15542u3;
                if (i != 0) {
                    yi7 yi7Var6 = ((C1368a) si7Var).f18357L1;
                    this.f26124a = ikaVar;
                    this.f26125b = str;
                    this.f26126c = str2;
                    this.f26127d = str3;
                    this.f26128e = i;
                    this.f26129f = 4;
                    objM15542u4 = AbstractC3224d.m15542u(yi7Var6, this);
                    if (objM15542u4 != coroutineSingletons) {
                        str4 = str2;
                        str5 = str;
                        ikaVar2 = ikaVar;
                    }
                    return coroutineSingletons;
                }
                listM22622n1 = null;
                String strName3 = this.f26131h.name();
                strMo4589b2 = ikaVar.f44237a;
                if (vk9.m23391n0(strMo4589b2)) {
                    strMo4589b2 = null;
                }
                if (strMo4589b2 == null) {
                    if (str != null) {
                        if (vk9.m23391n0(str)) {
                            str = null;
                        }
                        strMo4589b2 = str;
                    } else {
                        strMo4589b2 = null;
                    }
                    if (strMo4589b2 == null) {
                        strMo4589b2 = c2109f.f26171c.mo4589b2();
                    }
                }
                String str17 = strMo4589b2;
                str6 = ikaVar.f44239c;
                if (vk9.m23391n0(str6)) {
                    str6 = null;
                }
                if (str6 == null) {
                    if (str2 != null) {
                        if (vk9.m23391n0(str2)) {
                            str2 = null;
                        }
                        str6 = str2;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = UserImportDefaults.Course.getDefault();
                    }
                }
                String str18 = str6;
                str7 = ikaVar.f44240d;
                if (vk9.m23391n0(str7)) {
                    str7 = null;
                }
                if (str7 == null) {
                    if (str3 != null) {
                        if (vk9.m23391n0(str3)) {
                            str3 = null;
                        }
                        str7 = str3;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = UserImportDefaults.Level.getDefault();
                    }
                }
                String str19 = str7;
                list = ikaVar.f44245i;
                if (!ikaVar.f44246j && list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    list2 = list;
                } else {
                    if (listM22622n1 != null && !listM22622n1.isEmpty()) {
                        list3 = listM22622n1;
                    }
                    if (list3 == null) {
                        list = EmptyList.f47638a;
                        list2 = list;
                    } else {
                        list2 = list3;
                    }
                }
                jkaVar.mo9011N0(ika.m13999a(ikaVar, str17, null, str18, str19, strName3, null, null, null, list2, 226));
                return xfa.f68157a;
            }
            if (i2 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str20 = this.f26127d;
            str4 = this.f26126c;
            str5 = this.f26125b;
            ikaVar2 = this.f26124a;
            AbstractC3193b.m15359b(obj);
            str3 = str20;
            objM15542u4 = obj;
        }
        set = (Set) objM15542u4;
        if (set != null) {
            listM22622n1 = u91.m22622n1(set);
            str2 = str4;
            str = str5;
            ikaVar = ikaVar2;
        } else {
            str2 = str4;
            str = str5;
            ikaVar = ikaVar2;
            listM22622n1 = null;
        }
        String strName4 = this.f26131h.name();
        strMo4589b2 = ikaVar.f44237a;
        if (vk9.m23391n0(strMo4589b2)) {
            strMo4589b2 = null;
        }
        if (strMo4589b2 == null) {
            if (str != null) {
                if (vk9.m23391n0(str)) {
                    str = null;
                }
                strMo4589b2 = str;
            } else {
                strMo4589b2 = null;
            }
            if (strMo4589b2 == null) {
                strMo4589b2 = c2109f.f26171c.mo4589b2();
            }
        }
        String str110 = strMo4589b2;
        str6 = ikaVar.f44239c;
        if (vk9.m23391n0(str6)) {
            str6 = null;
        }
        if (str6 == null) {
            if (str2 != null) {
                if (vk9.m23391n0(str2)) {
                    str2 = null;
                }
                str6 = str2;
            } else {
                str6 = null;
            }
            if (str6 == null) {
                str6 = UserImportDefaults.Course.getDefault();
            }
        }
        String str111 = str6;
        str7 = ikaVar.f44240d;
        if (vk9.m23391n0(str7)) {
            str7 = null;
        }
        if (str7 == null) {
            if (str3 != null) {
                if (vk9.m23391n0(str3)) {
                    str3 = null;
                }
                str7 = str3;
            } else {
                str7 = null;
            }
            if (str7 == null) {
                str7 = UserImportDefaults.Level.getDefault();
            }
        }
        String str112 = str7;
        list = ikaVar.f44245i;
        if (!ikaVar.f44246j) {
            list = null;
        }
        if (list != null) {
            list2 = list;
        } else {
            if (listM22622n1 != null) {
                list3 = listM22622n1;
            }
            if (list3 == null) {
                list = EmptyList.f47638a;
                list2 = list;
            } else {
                list2 = list3;
            }
        }
        jkaVar.mo9011N0(ika.m13999a(ikaVar, str110, null, str111, str112, strName4, null, null, null, list2, 226));
        return xfa.f68157a;
        str = (String) objM15542u;
        if (i != 0) {
            yi7 yi7Var7 = ((C1368a) si7Var).f18351J1;
            this.f26124a = ikaVar;
            this.f26125b = str;
            this.f26128e = i;
            this.f26129f = 2;
            objM15542u2 = AbstractC3224d.m15542u(yi7Var7, this);
        } else {
            str2 = null;
            if (i == 0) {
                str3 = null;
                if (i != 0) {
                    yi7 yi7Var8 = ((C1368a) si7Var).f18357L1;
                    this.f26124a = ikaVar;
                    this.f26125b = str;
                    this.f26126c = str2;
                    this.f26127d = str3;
                    this.f26128e = i;
                    this.f26129f = 4;
                    objM15542u4 = AbstractC3224d.m15542u(yi7Var8, this);
                    if (objM15542u4 != coroutineSingletons) {
                        str4 = str2;
                        str5 = str;
                        ikaVar2 = ikaVar;
                        set = (Set) objM15542u4;
                        if (set != null) {
                            listM22622n1 = u91.m22622n1(set);
                            str2 = str4;
                            str = str5;
                            ikaVar = ikaVar2;
                        } else {
                            str2 = str4;
                            str = str5;
                            ikaVar = ikaVar2;
                            listM22622n1 = null;
                        }
                    }
                } else {
                    listM22622n1 = null;
                }
                String strName5 = this.f26131h.name();
                strMo4589b2 = ikaVar.f44237a;
                if (vk9.m23391n0(strMo4589b2)) {
                    strMo4589b2 = null;
                }
                if (strMo4589b2 == null) {
                    if (str != null) {
                        if (vk9.m23391n0(str)) {
                            str = null;
                        }
                        strMo4589b2 = str;
                    } else {
                        strMo4589b2 = null;
                    }
                    if (strMo4589b2 == null) {
                        strMo4589b2 = c2109f.f26171c.mo4589b2();
                    }
                }
                String str113 = strMo4589b2;
                str6 = ikaVar.f44239c;
                if (vk9.m23391n0(str6)) {
                    str6 = null;
                }
                if (str6 == null) {
                    if (str2 != null) {
                        if (vk9.m23391n0(str2)) {
                            str2 = null;
                        }
                        str6 = str2;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = UserImportDefaults.Course.getDefault();
                    }
                }
                String str114 = str6;
                str7 = ikaVar.f44240d;
                if (vk9.m23391n0(str7)) {
                    str7 = null;
                }
                if (str7 == null) {
                    if (str3 != null) {
                        if (vk9.m23391n0(str3)) {
                            str3 = null;
                        }
                        str7 = str3;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = UserImportDefaults.Level.getDefault();
                    }
                }
                String str115 = str7;
                list = ikaVar.f44245i;
                if (!ikaVar.f44246j) {
                    list = null;
                }
                if (list != null) {
                    list2 = list;
                } else {
                    if (listM22622n1 != null) {
                        list3 = listM22622n1;
                    }
                    if (list3 == null) {
                        list = EmptyList.f47638a;
                        list2 = list;
                    } else {
                        list2 = list3;
                    }
                }
                jkaVar.mo9011N0(ika.m13999a(ikaVar, str113, null, str114, str115, strName5, null, null, null, list2, 226));
                return xfa.f68157a;
            }
            yi7 yi7Var9 = ((C1368a) si7Var).f18354K1;
            this.f26124a = ikaVar;
            this.f26125b = str;
            this.f26126c = str2;
            this.f26128e = i;
            this.f26129f = 3;
            objM15542u3 = AbstractC3224d.m15542u(yi7Var9, this);
        }
        return coroutineSingletons;
    }
}
