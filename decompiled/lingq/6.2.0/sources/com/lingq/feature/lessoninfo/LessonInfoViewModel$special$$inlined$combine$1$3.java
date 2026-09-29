package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0790ay;
import p000.C2907cy;
import p000.C2944dy;
import p000.C2981ey;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.aj3;
import p000.b35;
import p000.c32;
import p000.c35;
import p000.cl9;
import p000.d35;
import p000.e35;
import p000.e83;
import p000.f35;
import p000.fa4;
import p000.t35;
import p000.u25;
import p000.u35;
import p000.v35;
import p000.vk9;
import p000.w25;
import p000.xfa;
import p000.y02;
import p000.y49;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$special$$inlined$combine$1$3", m4291f = "LessonInfoViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonInfoViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26393a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26394b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f26395c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2132c f26396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$special$$inlined$combine$1$3(C2132c c2132c, Continuation continuation) {
        super(3, continuation);
        this.f26396d = c2132c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonInfoViewModel$special$$inlined$combine$1$3 lessonInfoViewModel$special$$inlined$combine$1$3 = new LessonInfoViewModel$special$$inlined$combine$1$3(this.f26396d, (Continuation) obj3);
        lessonInfoViewModel$special$$inlined$combine$1$3.f26394b = (e83) obj;
        lessonInfoViewModel$special$$inlined$combine$1$3.f26395c = (Object[]) obj2;
        return lessonInfoViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:123:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0215  */
    /* JADX WARN: Code duplicated, block: B:127:0x021a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0220  */
    /* JADX WARN: Code duplicated, block: B:133:0x022b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:140:0x0240  */
    /* JADX WARN: Code duplicated, block: B:141:0x0243  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0258  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [e83, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        boolean z;
        boolean zBooleanValue;
        boolean z2;
        boolean zBooleanValue2;
        e35 e35Var;
        Object v35Var;
        ?? r1;
        String str2;
        String str3;
        SharedByRole sharedByRole;
        int iHashCode;
        String str4;
        w25 w25Var = this.f26396d.f26429t;
        e83 e83Var = this.f26394b;
        Object[] objArr = this.f26395c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26393a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonInfo lessonInfo = (LessonInfo) objArr[0];
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) objArr[1];
            LibraryItem libraryItem = (LibraryItem) objArr[2];
            Object obj2 = objArr[3];
            obj2.getClass();
            String str5 = (String) obj2;
            Object obj3 = objArr[4];
            obj3.getClass();
            boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
            Object obj4 = objArr[5];
            obj4.getClass();
            int iIntValue = ((Integer) obj4).intValue();
            Object obj5 = objArr[6];
            obj5.getClass();
            boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[7];
            obj6.getClass();
            boolean zBooleanValue5 = ((Boolean) obj6).booleanValue();
            Object obj7 = objArr[8];
            obj7.getClass();
            f35 f35Var = (f35) obj7;
            InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) objArr[9];
            if (lessonInfo == null) {
                v35Var = new u35(w25Var.f66283b, w25Var.f66284c, w25Var.f66285d);
                r1 = 0;
            } else {
                Boolean bool = lessonInfo.f19364T;
                String str6 = lessonInfo.f19370f;
                if (interfaceC3055gy instanceof C2981ey) {
                    str = "generating";
                } else if (interfaceC3055gy instanceof C2907cy) {
                    str = "downloading";
                } else if (interfaceC3055gy instanceof C0790ay) {
                    str = "completed";
                } else {
                    str = interfaceC3055gy instanceof C2944dy ? "error" : "idle";
                }
                String str7 = str;
                int iMax = interfaceC3055gy instanceof C2907cy ? Math.max(1, ((C2907cy) interfaceC3055gy).f34700c) : 0;
                int i2 = lessonInfo.f19365a;
                String str8 = lessonInfo.f19366b;
                String str9 = lessonInfo.f19367c;
                String str10 = str9 == null ? "" : str9;
                String str11 = lessonInfo.f19354J;
                String str12 = str11 == null ? "" : str11;
                String str13 = lessonInfo.f19368d;
                if (str13 == null) {
                    str13 = w25Var.f66284c;
                }
                String str14 = str13;
                String str15 = lessonInfo.f19390z;
                if (str15 == null) {
                    str15 = w25Var.f66285d;
                }
                String str16 = str15;
                String strM24809g = y02.m24809g(((long) lessonInfo.f19371g) * 1000);
                int i3 = lessonInfo.f19381q;
                Integer num = lessonInfo.f19379o;
                int iIntValue2 = num != null ? num.intValue() : 0;
                String str17 = lessonInfo.f19347C;
                String str18 = str17 == null ? "" : str17;
                String str19 = lessonInfo.f19348D;
                String str20 = str19 == null ? "" : str19;
                boolean z3 = cl9.m4834Q(str6, "private", true) || cl9.m4834Q(str6, "D", true);
                boolean z4 = ((fa4.m11650l(str6, "external") && lessonInfo.f19357M != null) || lessonInfo.m8085a()) && !fa4.m11650l(bool, Boolean.TRUE);
                int i4 = lessonInfo.f19372h;
                String str21 = lessonInfo.f19373i;
                String str22 = lessonInfo.f19359O;
                List list = lessonInfo.f19351G;
                if (list == null) {
                    list = EmptyList.f47638a;
                }
                c35 c35Var = new c35(i2, str8, str10, str12, str14, str16, strM24809g, i3, iIntValue2, str18, str20, z3, z4, i4, str21, str22, list, lessonInfo.f19358N, lessonInfo.f19357M, lessonInfo.f19356L, lessonInfo.m8085a(), (!lessonInfo.m8085a() || (str4 = lessonInfo.f19369e) == null || vk9.m23391n0(str4)) ? false : true, lessonInfo.f19371g);
                int i5 = libraryItemCounter != null ? libraryItemCounter.f19464j : 0;
                int i6 = libraryItemCounter != null ? libraryItemCounter.f19466l : 0;
                int i7 = libraryItemCounter != null ? libraryItemCounter.f19465k : 0;
                int i8 = libraryItemCounter != null ? libraryItemCounter.f19468n : 0;
                int i9 = libraryItemCounter != null ? libraryItemCounter.f19469o : 0;
                if (libraryItemCounter != null) {
                    zBooleanValue = libraryItemCounter.f19456b;
                } else {
                    Boolean bool2 = lessonInfo.f19384t;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        z = false;
                    }
                    if (libraryItemCounter != null) {
                        zBooleanValue2 = libraryItemCounter.f19460f;
                    } else {
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        d35 d35Var = new d35(i5, i6, i7, i8, i9, z, z2);
                        if (libraryItem != null) {
                            int i10 = libraryItem.f19426a;
                            str2 = libraryItem.f19433e;
                            if (str2 == null && (str2 = lessonInfo.f19373i) == null) {
                                str2 = "";
                            }
                            y49 y49Var = SharedByRole.Companion;
                            str3 = libraryItem.f19414O;
                            y49Var.getClass();
                            if (str3 == null) {
                                sharedByRole = null;
                            } else {
                                iHashCode = str3.hashCode();
                                if (iHashCode != -1307827859) {
                                    if (iHashCode != 94630981) {
                                        if (iHashCode != 812757528 && str3.equals("librarian")) {
                                            sharedByRole = SharedByRole.Librarian;
                                        } else {
                                            sharedByRole = null;
                                        }
                                    } else if (str3.equals("chief")) {
                                        sharedByRole = SharedByRole.ChiefLibrarian;
                                    } else {
                                        sharedByRole = null;
                                    }
                                } else if (str3.equals("editor")) {
                                    sharedByRole = SharedByRole.Editor;
                                } else {
                                    sharedByRole = null;
                                }
                            }
                            e35Var = new e35(i10, str2, sharedByRole);
                        } else {
                            e35Var = null;
                        }
                        t35 t35Var = new t35(str5, zBooleanValue3);
                        String str23 = lessonInfo.f19353I;
                        v35Var = new v35(c35Var, d35Var, e35Var, t35Var, new u25(iIntValue, iMax, str23 != null ? str23 : "", str7, zBooleanValue4, zBooleanValue5), f35Var, new b35(w25Var.f66287f, w25Var.f66288g));
                        r1 = 0;
                    }
                    z2 = zBooleanValue2;
                    d35 d35Var2 = new d35(i5, i6, i7, i8, i9, z, z2);
                    if (libraryItem != null) {
                        int i11 = libraryItem.f19426a;
                        str2 = libraryItem.f19433e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        y49 y49Var2 = SharedByRole.Companion;
                        str3 = libraryItem.f19414O;
                        y49Var2.getClass();
                        if (str3 == null) {
                            sharedByRole = null;
                        } else {
                            iHashCode = str3.hashCode();
                            if (iHashCode != -1307827859) {
                                if (iHashCode != 94630981) {
                                    if (iHashCode != 812757528) {
                                        sharedByRole = null;
                                    } else {
                                        sharedByRole = SharedByRole.Librarian;
                                    }
                                } else if (str3.equals("chief")) {
                                    sharedByRole = null;
                                } else {
                                    sharedByRole = SharedByRole.ChiefLibrarian;
                                }
                            } else if (str3.equals("editor")) {
                                sharedByRole = null;
                            } else {
                                sharedByRole = SharedByRole.Editor;
                            }
                        }
                        e35Var = new e35(i11, str2, sharedByRole);
                    } else {
                        e35Var = null;
                    }
                    t35 t35Var2 = new t35(str5, zBooleanValue3);
                    String str24 = lessonInfo.f19353I;
                    v35Var = new v35(c35Var, d35Var2, e35Var, t35Var2, new u25(iIntValue, iMax, str24 != null ? str24 : "", str7, zBooleanValue4, zBooleanValue5), f35Var, new b35(w25Var.f66287f, w25Var.f66288g));
                    r1 = 0;
                }
                z = zBooleanValue;
                if (libraryItemCounter != null) {
                    zBooleanValue2 = libraryItemCounter.f19460f;
                } else {
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    d35 d35Var3 = new d35(i5, i6, i7, i8, i9, z, z2);
                    if (libraryItem != null) {
                        int i12 = libraryItem.f19426a;
                        str2 = libraryItem.f19433e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        y49 y49Var3 = SharedByRole.Companion;
                        str3 = libraryItem.f19414O;
                        y49Var3.getClass();
                        if (str3 == null) {
                            sharedByRole = null;
                        } else {
                            iHashCode = str3.hashCode();
                            if (iHashCode != -1307827859) {
                                if (iHashCode != 94630981) {
                                    if (iHashCode != 812757528) {
                                        sharedByRole = null;
                                    } else {
                                        sharedByRole = SharedByRole.Librarian;
                                    }
                                } else if (str3.equals("chief")) {
                                    sharedByRole = null;
                                } else {
                                    sharedByRole = SharedByRole.ChiefLibrarian;
                                }
                            } else if (str3.equals("editor")) {
                                sharedByRole = null;
                            } else {
                                sharedByRole = SharedByRole.Editor;
                            }
                        }
                        e35Var = new e35(i12, str2, sharedByRole);
                    } else {
                        e35Var = null;
                    }
                    t35 t35Var3 = new t35(str5, zBooleanValue3);
                    String str25 = lessonInfo.f19353I;
                    v35Var = new v35(c35Var, d35Var3, e35Var, t35Var3, new u25(iIntValue, iMax, str25 != null ? str25 : "", str7, zBooleanValue4, zBooleanValue5), f35Var, new b35(w25Var.f66287f, w25Var.f66288g));
                    r1 = 0;
                }
                z2 = zBooleanValue2;
                d35 d35Var4 = new d35(i5, i6, i7, i8, i9, z, z2);
                if (libraryItem != null) {
                    int i13 = libraryItem.f19426a;
                    str2 = libraryItem.f19433e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    y49 y49Var4 = SharedByRole.Companion;
                    str3 = libraryItem.f19414O;
                    y49Var4.getClass();
                    if (str3 == null) {
                        sharedByRole = null;
                    } else {
                        iHashCode = str3.hashCode();
                        if (iHashCode != -1307827859) {
                            if (iHashCode != 94630981) {
                                if (iHashCode != 812757528) {
                                    sharedByRole = null;
                                } else {
                                    sharedByRole = SharedByRole.Librarian;
                                }
                            } else if (str3.equals("chief")) {
                                sharedByRole = null;
                            } else {
                                sharedByRole = SharedByRole.ChiefLibrarian;
                            }
                        } else if (str3.equals("editor")) {
                            sharedByRole = null;
                        } else {
                            sharedByRole = SharedByRole.Editor;
                        }
                    }
                    e35Var = new e35(i13, str2, sharedByRole);
                } else {
                    e35Var = null;
                }
                t35 t35Var4 = new t35(str5, zBooleanValue3);
                String str26 = lessonInfo.f19353I;
                v35Var = new v35(c35Var, d35Var4, e35Var, t35Var4, new u25(iIntValue, iMax, str26 != null ? str26 : "", str7, zBooleanValue4, zBooleanValue5), f35Var, new b35(w25Var.f66287f, w25Var.f66288g));
                r1 = 0;
            }
            this.f26394b = r1;
            this.f26395c = r1;
            this.f26393a = 1;
            if (e83Var.emit(v35Var, this) == coroutineSingletons) {
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
