package com.lingq.feature.library;

import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.p012ui.ImageSize;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.a69;
import p000.b69;
import p000.c32;
import p000.d85;
import p000.ea5;
import p000.fa4;
import p000.fa5;
import p000.jfa;
import p000.jo1;
import p000.omd;
import p000.q59;
import p000.r59;
import p000.s45;
import p000.s59;
import p000.t59;
import p000.u59;
import p000.u91;
import p000.v59;
import p000.vk9;
import p000.vz1;
import p000.w59;
import p000.x95;
import p000.xfa;
import p000.xl7;
import p000.y02;
import p000.y59;
import p000.y85;
import p000.z59;
import p000.z85;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$loadShelfContent$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$loadShelfContent$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryShelf f26499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LibraryTab f26500d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f26501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$loadShelfContent$2(C2146e c2146e, LibraryShelf libraryShelf, LibraryTab libraryTab, String str, Continuation continuation) {
        super(2, continuation);
        this.f26498b = c2146e;
        this.f26499c = libraryShelf;
        this.f26500d = libraryTab;
        this.f26501e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$loadShelfContent$2 libraryUpdateViewModel$loadShelfContent$2 = new LibraryUpdateViewModel$loadShelfContent$2(this.f26498b, this.f26499c, this.f26500d, this.f26501e, continuation);
        libraryUpdateViewModel$loadShelfContent$2.f26497a = obj;
        return libraryUpdateViewModel$loadShelfContent$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$loadShelfContent$2 libraryUpdateViewModel$loadShelfContent$2 = (LibraryUpdateViewModel$loadShelfContent$2) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$loadShelfContent$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0301  */
    /* JADX WARN: Code duplicated, block: B:173:0x0308  */
    /* JADX WARN: Code duplicated, block: B:175:0x030c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0311  */
    /* JADX WARN: Code duplicated, block: B:182:0x0328  */
    /* JADX WARN: Code duplicated, block: B:188:0x0343  */
    /* JADX WARN: Code duplicated, block: B:193:0x034d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0362  */
    /* JADX WARN: Code duplicated, block: B:197:0x0365  */
    /* JADX WARN: Code duplicated, block: B:199:0x0369  */
    /* JADX WARN: Code duplicated, block: B:200:0x036c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0370  */
    /* JADX WARN: Code duplicated, block: B:203:0x0373  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        y59 y59Var;
        Object value;
        Object s59Var;
        Object w59Var;
        int i;
        int iIntValue;
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        String strValueOf;
        String str4;
        Float f;
        String str5;
        Triple triple = (Triple) this.f26497a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        fa5 fa5Var = (fa5) triple.f47633a;
        xl7 xl7Var = (xl7) triple.f47634b;
        Set set = (Set) triple.f47635c;
        LibraryShelf libraryShelf = this.f26499c;
        String str6 = libraryShelf.f19496d;
        ArrayList arrayList = fa5Var.f38718a;
        List list = fa5Var.f38719b;
        List list2 = fa5Var.f38720c;
        LibraryTab libraryTab = this.f26500d;
        libraryTab.getClass();
        boolean zM23380c0 = vk9.m23380c0(libraryTab.f19506f, "isArchived=true", true);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(Integer.valueOf(((ea5) obj3).f36924a.f19426a))) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ea5 ea5Var = (ea5) it.next();
            LibraryItem libraryItem = ea5Var.f36924a;
            LibraryItemCounter libraryItemCounter = ea5Var.f36925b;
            String str7 = libraryItem.f19428b;
            List list3 = list;
            String str8 = libraryItem.f19411L;
            boolean z5 = zM23380c0;
            boolean z6 = libraryItem.f19415P;
            Boolean bool = libraryItem.f19418S;
            Integer num = libraryItem.f19449u;
            String str9 = libraryItem.f19410K;
            String str10 = libraryItem.f19436h;
            Iterator it2 = it;
            String str11 = libraryItem.f19409J;
            String str12 = libraryItem.f19447s;
            fa5 fa5Var2 = fa5Var;
            String str13 = libraryItem.f19433e;
            int i3 = libraryItem.f19426a;
            LibraryTab libraryTab2 = libraryTab;
            if (fa4.m11650l(str7, LibraryItemType.Content.getValue())) {
                if (!u91.m22633z0(list3, str12) || libraryItem.m8088c()) {
                    int i4 = libraryItem.f19426a;
                    Integer num2 = libraryItem.f19437i;
                    String str14 = libraryItem.f19442n;
                    Integer num3 = libraryItem.f19441m;
                    String strM14422e = jfa.m14422e(str11, str10, ImageSize.Medium);
                    String str15 = str9 == null ? "" : str9;
                    if (libraryItemCounter == null || (strValueOf = String.valueOf(libraryItemCounter.f19464j)) == null) {
                        strValueOf = String.valueOf(num);
                    }
                    String str16 = strValueOf;
                    String strValueOf2 = String.valueOf(libraryItemCounter != null ? libraryItemCounter.f19466l : 0);
                    String strValueOf3 = String.valueOf(libraryItemCounter != null ? Integer.valueOf(libraryItemCounter.f19465k) : null);
                    String str17 = str13 == null ? "" : str13;
                    if (libraryItem.m8090e()) {
                        if (str12 == null) {
                            str4 = "";
                        } else {
                            str4 = str12;
                        }
                    } else if (str14 == null) {
                        str4 = "";
                    } else {
                        str4 = str14;
                    }
                    String strM24809g = y02.m24809g((num2 != null ? num2.intValue() : 0L) * 1000);
                    float fFloatValue = fa4.m11650l(libraryItem.f19445q, Boolean.TRUE) ? 1.0f : ((libraryItemCounter == null || (f = libraryItemCounter.f19457c) == null) ? 0.0f : f.floatValue()) / 100.0f;
                    String str18 = libraryItem.f19424Y;
                    boolean z7 = (str18 == null || vk9.m23391n0(str18) || ((str5 = libraryItem.f19425Z) != null && !vk9.m23391n0(str5))) ? false : true;
                    boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                    boolean zM8090e = libraryItem.m8090e();
                    boolean z8 = libraryItemCounter != null ? libraryItemCounter.f19456b : false;
                    boolean z9 = (libraryItem.m8090e() || num3 == null || libraryItem.m8088c() || !omd.m18127Q(libraryItem, xl7Var.f68328b)) ? false : true;
                    boolean zContains = set.contains(Integer.valueOf(num3 != null ? num3.intValue() : 0));
                    int i5 = xl7Var.f68327a;
                    z85 z85Var = new z85(i4, strM14422e, str15, str16, strValueOf2, strValueOf3, str17, str4, strM24809g, fFloatValue, z7, zM8090e, zBooleanValue2, z8, z9, zContains, i5 != 0 && fa4.m11650l(str8, String.valueOf(i5)), z6 || z5, 67584);
                    int i6 = libraryItem.f19426a;
                    String str19 = str13 == null ? "" : str13;
                    int iIntValue2 = num3 != null ? num3.intValue() : 0;
                    String str20 = str14 == null ? "" : str14;
                    boolean zM8087b = libraryItem.m8087b();
                    String str21 = str10 == 0 ? "" : str10;
                    String str22 = str11 == null ? "" : str11;
                    String str23 = libraryShelf.f19496d;
                    String str24 = libraryShelf.f19498f;
                    boolean zM8090e2 = libraryItem.m8090e();
                    String str25 = libraryItem.f19448t;
                    y85 y85Var = new y85(num2 != null ? num2.intValue() : 0, str25 == null ? "" : str25, str12 == null ? "" : str12, zM8090e2, libraryItem.m8089d(), libraryItem.m8086a());
                    String str26 = libraryItem.f19412M;
                    String str27 = str26 == null ? "" : str26;
                    List list4 = libraryItem.f19422W;
                    if (list4 == null) {
                        list4 = EmptyList.f47638a;
                    }
                    s59Var = new t59(z85Var, new s45(i6, str19, iIntValue2, str20, str21, str22, str23, str24, zM8087b, y85Var, str27, list4, AbstractC3423or.m18268n(libraryShelf).f19502b), libraryItemCounter, libraryItem);
                } else {
                    if (str12 == null) {
                        str12 = "unknown_source";
                    }
                    s59Var = new u59(str12, str6 + "_" + i3);
                }
            } else if (fa4.m11650l(str7, LibraryItemType.Collection.getValue())) {
                boolean zContains2 = list2.contains(Integer.valueOf(i3));
                int i7 = libraryItem.f19426a;
                if (zContains2) {
                    s59Var = new s59(str13 == null ? "" : str13, i7, str6 + "_" + i7);
                } else {
                    String strM14422e2 = jfa.m14422e(str11, str10, ImageSize.Medium);
                    String str28 = str9 == null ? "" : str9;
                    String strValueOf4 = String.valueOf(libraryItemCounter != null ? Integer.valueOf(libraryItemCounter.f19464j) : num);
                    String strValueOf5 = String.valueOf(libraryItemCounter != null ? libraryItemCounter.f19466l : 0);
                    String str29 = str13 == null ? "" : str13;
                    if (libraryItemCounter != null) {
                        iIntValue = libraryItemCounter.f19463i;
                    } else {
                        Integer num4 = libraryItem.f19419T;
                        if (num4 != null) {
                            iIntValue = num4.intValue();
                        } else {
                            i = 0;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (libraryItemCounter != null) {
                            z = libraryItemCounter.f19456b;
                        } else {
                            z = false;
                        }
                        boolean zM8088c = libraryItem.m8088c();
                        if (libraryItem.m8088c() && omd.m18127Q(libraryItem, xl7Var.f68328b)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean zContains3 = set.contains(Integer.valueOf(i3));
                        i2 = xl7Var.f68327a;
                        if (i2 == 0 && fa4.m11650l(str8, String.valueOf(i2))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z6 || z5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        d85 d85Var = new d85(i7, strM14422e2, str28, strValueOf4, strValueOf5, str29, "", 0.0f, i, zM8088c, z, zBooleanValue, z2, zContains3, z3, z4);
                        int i8 = libraryItem.f19426a;
                        if (str13 == null) {
                            str = "";
                        } else {
                            str = str13;
                        }
                        if (str10 == null) {
                            str2 = "";
                        } else {
                            str2 = str10;
                        }
                        if (str11 == null) {
                            str3 = "";
                        } else {
                            str3 = str11;
                        }
                        w59Var = new r59(d85Var, new jo1(i8, str, str2, str3, libraryShelf.f19496d, libraryShelf.f19498f, AbstractC3423or.m18268n(libraryShelf).f19502b), libraryItemCounter, libraryItem);
                        s59Var = w59Var;
                    }
                    i = iIntValue;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (libraryItemCounter != null) {
                        z = libraryItemCounter.f19456b;
                    } else {
                        z = false;
                    }
                    boolean zM8088c2 = libraryItem.m8088c();
                    if (libraryItem.m8088c()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    boolean zContains4 = set.contains(Integer.valueOf(i3));
                    i2 = xl7Var.f68327a;
                    if (i2 == 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z6) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    d85 d85Var2 = new d85(i7, strM14422e2, str28, strValueOf4, strValueOf5, str29, "", 0.0f, i, zM8088c2, z, zBooleanValue, z2, zContains4, z3, z4);
                    int i9 = libraryItem.f19426a;
                    if (str13 == null) {
                        str = "";
                    } else {
                        str = str13;
                    }
                    if (str10 == null) {
                        str2 = "";
                    } else {
                        str2 = str10;
                    }
                    if (str11 == null) {
                        str3 = "";
                    } else {
                        str3 = str11;
                    }
                    w59Var = new r59(d85Var2, new jo1(i9, str, str2, str3, libraryShelf.f19496d, libraryShelf.f19498f, AbstractC3423or.m18268n(libraryShelf).f19502b), libraryItemCounter, libraryItem);
                    s59Var = w59Var;
                }
            } else if (fa4.m11650l(str7, LibraryItemType.Folder.getValue())) {
                w59Var = new w59(new x95(i3, str13 == null ? "" : str13), libraryItem);
                s59Var = w59Var;
            } else {
                s59Var = null;
            }
            if (s59Var != null) {
                arrayList3.add(s59Var);
            }
            list = list3;
            zM23380c0 = z5;
            it = it2;
            fa5Var = fa5Var2;
            libraryTab = libraryTab2;
        }
        fa5 fa5Var3 = fa5Var;
        LibraryTab libraryTab3 = libraryTab;
        Iterator<E> it3 = LibraryContentType.getEntries().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            Object next = it3.next();
            LibraryTab libraryTab4 = libraryTab3;
            if (fa4.m11650l(((LibraryContentType) next).getValue(), libraryTab4.f19502b)) {
                obj2 = next;
                break;
            }
            libraryTab3 = libraryTab4;
        }
        LibraryContentType libraryContentType = (LibraryContentType) obj2;
        if (fa5Var3.f38721d) {
            y59Var = new y59(vz1.m23604J(new q59("empty_" + str6 + "_" + libraryContentType, libraryContentType == LibraryContentType.Lessons, libraryContentType == LibraryContentType.Playlists, fa4.m11650l(str6, LibraryShelfType.MyLessons.getValue()))), z59.f70958a);
        } else if (arrayList3.isEmpty()) {
            y59Var = new y59(vz1.m23604J(new v59(libraryContentType == LibraryContentType.Lessons, "empty_" + str6 + "_" + libraryContentType)), a69.f298a);
        } else {
            y59Var = new y59(arrayList3, b69.f8021a);
        }
        C3244l c3244l = this.f26498b.f26661J;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U((Map) value, new Pair(this.f26501e, y59Var))));
        return xfa.f68157a;
    }
}
