package com.lingq.core.settings.domain;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.settings.ViewKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.g9a;
import p000.hm5;
import p000.ig8;
import p000.lg8;
import p000.mg8;
import p000.t1a;
import p000.u1a;
import p000.v1a;
import p000.vz1;
import p000.x1a;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1870i {
    public static final t1a Companion = new t1a();

    /* JADX INFO: renamed from: d */
    public static final Map f22947d = AbstractC3194a.m15365R(new Pair(ViewKeys.Flashcards, "Flashcard Active"), new Pair(ViewKeys.ReverseFlashcards, "Reverse Flashcard Active"), new Pair(ViewKeys.Cloze, "Cloze Test Active"), new Pair(ViewKeys.MultipleChoice, "Multiple Choice Active"), new Pair(ViewKeys.Dictation, "Dictation Active"), new Pair(ViewKeys.Unscramble, "Unscramble Active"), new Pair(ViewKeys.Speaking, "Speaking Active"), new Pair(ViewKeys.Matching, "Matching Active"));

    /* JADX INFO: renamed from: a */
    public final ig8 f22948a;

    /* JADX INFO: renamed from: b */
    public final C1862a f22949b;

    /* JADX INFO: renamed from: c */
    public final hm5 f22950c;

    public C1870i(ig8 ig8Var, C1862a c1862a, hm5 hm5Var) {
        ig8Var.getClass();
        hm5Var.getClass();
        this.f22948a = ig8Var;
        this.f22949b = c1862a;
        this.f22950c = hm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:53:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0171 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8635a(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ToggleActivityUseCase$canChangeActivities$1 toggleActivityUseCase$canChangeActivities$1;
        Boolean[] boolArr;
        boolean z2;
        Object[] objArr;
        int i;
        boolean z3;
        int i2;
        Boolean[] boolArr2;
        Object[] objArr2;
        boolean z4;
        int i3;
        Boolean[] boolArr3;
        Object[] objArr3;
        boolean z5;
        Boolean[] boolArr4;
        Object[] objArr4;
        Boolean[] boolArr5;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        List listM23605K;
        Object[] objArr8;
        Object[] objArr9;
        int i4;
        List list;
        Iterator it;
        int i5;
        if (continuationImpl instanceof ToggleActivityUseCase$canChangeActivities$1) {
            toggleActivityUseCase$canChangeActivities$1 = (ToggleActivityUseCase$canChangeActivities$1) continuationImpl;
            int i6 = toggleActivityUseCase$canChangeActivities$1.f22879g;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                toggleActivityUseCase$canChangeActivities$1.f22879g = i6 - Integer.MIN_VALUE;
            } else {
                toggleActivityUseCase$canChangeActivities$1 = new ToggleActivityUseCase$canChangeActivities$1(this, continuationImpl);
            }
        } else {
            toggleActivityUseCase$canChangeActivities$1 = new ToggleActivityUseCase$canChangeActivities$1(this, continuationImpl);
        }
        Object objM15541t = toggleActivityUseCase$canChangeActivities$1.f22877e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = toggleActivityUseCase$canChangeActivities$1.f22879g;
        int i8 = 4;
        int i9 = 3;
        int i10 = 2;
        ig8 ig8Var = this.f22948a;
        switch (i7) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                if (z) {
                    Boolean[] boolArr6 = new Boolean[5];
                    lg8 lg8Var = ((C1370c) ig8Var).f18502N;
                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr6;
                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr6;
                    toggleActivityUseCase$canChangeActivities$1.f22873a = z;
                    toggleActivityUseCase$canChangeActivities$1.f22876d = 0;
                    toggleActivityUseCase$canChangeActivities$1.f22879g = 1;
                    objM15541t = AbstractC3224d.m15541t(lg8Var, toggleActivityUseCase$canChangeActivities$1);
                    if (objM15541t != obj) {
                        z3 = z;
                        i2 = 0;
                        boolArr2 = boolArr6;
                        objArr2 = boolArr6;
                        objArr2[i2] = objM15541t;
                        lg8 lg8Var2 = ((C1370c) ig8Var).f18503O;
                        toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr2;
                        toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr2;
                        toggleActivityUseCase$canChangeActivities$1.f22873a = z3;
                        toggleActivityUseCase$canChangeActivities$1.f22876d = 1;
                        toggleActivityUseCase$canChangeActivities$1.f22879g = 2;
                        objM15541t = AbstractC3224d.m15541t(lg8Var2, toggleActivityUseCase$canChangeActivities$1);
                        if (objM15541t != obj) {
                            z4 = z3;
                            i3 = 1;
                            boolArr3 = boolArr2;
                            objArr3 = boolArr2;
                            objArr3[i3] = objM15541t;
                            mg8 mg8Var = ((C1370c) ig8Var).f18504P;
                            toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr3;
                            toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr3;
                            toggleActivityUseCase$canChangeActivities$1.f22873a = z4;
                            toggleActivityUseCase$canChangeActivities$1.f22876d = 2;
                            toggleActivityUseCase$canChangeActivities$1.f22879g = 3;
                            objM15541t = AbstractC3224d.m15541t(mg8Var, toggleActivityUseCase$canChangeActivities$1);
                            if (objM15541t != obj) {
                                z5 = z4;
                                boolArr4 = boolArr3;
                                objArr4 = boolArr3;
                                objArr4[i10] = objM15541t;
                                mg8 mg8Var2 = ((C1370c) ig8Var).f18505Q;
                                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr4;
                                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr4;
                                toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                                toggleActivityUseCase$canChangeActivities$1.f22876d = 3;
                                toggleActivityUseCase$canChangeActivities$1.f22879g = 4;
                                objM15541t = AbstractC3224d.m15541t(mg8Var2, toggleActivityUseCase$canChangeActivities$1);
                                if (objM15541t != obj) {
                                    Boolean[] boolArr7 = boolArr4;
                                    boolArr5 = boolArr7;
                                    objArr5 = boolArr7;
                                    objArr5[i9] = objM15541t;
                                    mg8 mg8Var3 = ((C1370c) ig8Var).f18506R;
                                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr5;
                                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr5;
                                    toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                                    toggleActivityUseCase$canChangeActivities$1.f22876d = 4;
                                    toggleActivityUseCase$canChangeActivities$1.f22879g = 5;
                                    objM15541t = AbstractC3224d.m15541t(mg8Var3, toggleActivityUseCase$canChangeActivities$1);
                                    if (objM15541t != obj) {
                                        Object[] objArr10 = boolArr5;
                                        objArr6 = objArr10;
                                        objArr7 = objArr10;
                                        objArr7[i8] = objM15541t;
                                        listM23605K = vz1.m23605K(objArr6);
                                        list = listM23605K;
                                        if ((list instanceof Collection) || !list.isEmpty()) {
                                            it = list.iterator();
                                            i5 = 0;
                                            while (it.hasNext()) {
                                                if (!((Boolean) it.next()).booleanValue() && (i5 = i5 + 1) < 0) {
                                                    vz1.m23626d0();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i5 = 0;
                                        }
                                        return Boolean.valueOf(i5 != 1);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    boolArr = new Boolean[2];
                    mg8 mg8Var4 = ((C1370c) ig8Var).f18504P;
                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr;
                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr;
                    toggleActivityUseCase$canChangeActivities$1.f22873a = z;
                    toggleActivityUseCase$canChangeActivities$1.f22876d = 0;
                    toggleActivityUseCase$canChangeActivities$1.f22879g = 6;
                    objM15541t = AbstractC3224d.m15541t(mg8Var4, toggleActivityUseCase$canChangeActivities$1);
                    if (objM15541t != obj) {
                        z2 = z;
                        objArr = boolArr;
                        i = 0;
                        objArr[i] = objM15541t;
                        mg8 mg8Var5 = ((C1370c) ig8Var).f18505Q;
                        toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr;
                        toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr;
                        toggleActivityUseCase$canChangeActivities$1.f22873a = z2;
                        toggleActivityUseCase$canChangeActivities$1.f22876d = 1;
                        toggleActivityUseCase$canChangeActivities$1.f22879g = 7;
                        objM15541t = AbstractC3224d.m15541t(mg8Var5, toggleActivityUseCase$canChangeActivities$1);
                        if (objM15541t != obj) {
                            objArr8 = boolArr;
                            objArr9 = objArr8;
                            i4 = 1;
                            objArr8[i4] = objM15541t;
                            listM23605K = vz1.m23605K(objArr9);
                            list = listM23605K;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                i5 = 0;
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                    }
                                }
                            } else {
                                it = list.iterator();
                                i5 = 0;
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                    }
                                }
                            }
                            return Boolean.valueOf(i5 != 1);
                        }
                    }
                }
                return obj;
            case 1:
                i2 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                z3 = toggleActivityUseCase$canChangeActivities$1.f22873a;
                Object[] objArr11 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Boolean[] boolArr8 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr2 = objArr11;
                boolArr2 = boolArr8;
                objArr2[i2] = objM15541t;
                lg8 lg8Var3 = ((C1370c) ig8Var).f18503O;
                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr2;
                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr2;
                toggleActivityUseCase$canChangeActivities$1.f22873a = z3;
                toggleActivityUseCase$canChangeActivities$1.f22876d = 1;
                toggleActivityUseCase$canChangeActivities$1.f22879g = 2;
                objM15541t = AbstractC3224d.m15541t(lg8Var3, toggleActivityUseCase$canChangeActivities$1);
                if (objM15541t != obj) {
                    z4 = z3;
                    i3 = 1;
                    boolArr3 = boolArr2;
                    objArr3 = boolArr2;
                    objArr3[i3] = objM15541t;
                    mg8 mg8Var6 = ((C1370c) ig8Var).f18504P;
                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr3;
                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr3;
                    toggleActivityUseCase$canChangeActivities$1.f22873a = z4;
                    toggleActivityUseCase$canChangeActivities$1.f22876d = 2;
                    toggleActivityUseCase$canChangeActivities$1.f22879g = 3;
                    objM15541t = AbstractC3224d.m15541t(mg8Var6, toggleActivityUseCase$canChangeActivities$1);
                    if (objM15541t != obj) {
                        z5 = z4;
                        boolArr4 = boolArr3;
                        objArr4 = boolArr3;
                        objArr4[i10] = objM15541t;
                        mg8 mg8Var7 = ((C1370c) ig8Var).f18505Q;
                        toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr4;
                        toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr4;
                        toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                        toggleActivityUseCase$canChangeActivities$1.f22876d = 3;
                        toggleActivityUseCase$canChangeActivities$1.f22879g = 4;
                        objM15541t = AbstractC3224d.m15541t(mg8Var7, toggleActivityUseCase$canChangeActivities$1);
                        if (objM15541t != obj) {
                            Boolean[] boolArr9 = boolArr4;
                            boolArr5 = boolArr9;
                            objArr5 = boolArr9;
                            objArr5[i9] = objM15541t;
                            mg8 mg8Var8 = ((C1370c) ig8Var).f18506R;
                            toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr5;
                            toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr5;
                            toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                            toggleActivityUseCase$canChangeActivities$1.f22876d = 4;
                            toggleActivityUseCase$canChangeActivities$1.f22879g = 5;
                            objM15541t = AbstractC3224d.m15541t(mg8Var8, toggleActivityUseCase$canChangeActivities$1);
                            if (objM15541t != obj) {
                                Object[] objArr12 = boolArr5;
                                objArr6 = objArr12;
                                objArr7 = objArr12;
                                objArr7[i8] = objM15541t;
                                listM23605K = vz1.m23605K(objArr6);
                                list = listM23605K;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    i5 = 0;
                                    while (it.hasNext()) {
                                        if (!((Boolean) it.next()).booleanValue()) {
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    i5 = 0;
                                    while (it.hasNext()) {
                                        if (!((Boolean) it.next()).booleanValue()) {
                                        }
                                    }
                                }
                                return Boolean.valueOf(i5 != 1);
                            }
                        }
                    }
                }
                return obj;
            case 2:
                i3 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                boolean z6 = toggleActivityUseCase$canChangeActivities$1.f22873a;
                Object[] objArr13 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Boolean[] boolArr10 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                z4 = z6;
                boolArr3 = boolArr10;
                objArr3 = objArr13;
                objArr3[i3] = objM15541t;
                mg8 mg8Var9 = ((C1370c) ig8Var).f18504P;
                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr3;
                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr3;
                toggleActivityUseCase$canChangeActivities$1.f22873a = z4;
                toggleActivityUseCase$canChangeActivities$1.f22876d = 2;
                toggleActivityUseCase$canChangeActivities$1.f22879g = 3;
                objM15541t = AbstractC3224d.m15541t(mg8Var9, toggleActivityUseCase$canChangeActivities$1);
                if (objM15541t != obj) {
                    z5 = z4;
                    boolArr4 = boolArr3;
                    objArr4 = boolArr3;
                    objArr4[i10] = objM15541t;
                    mg8 mg8Var10 = ((C1370c) ig8Var).f18505Q;
                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr4;
                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr4;
                    toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                    toggleActivityUseCase$canChangeActivities$1.f22876d = 3;
                    toggleActivityUseCase$canChangeActivities$1.f22879g = 4;
                    objM15541t = AbstractC3224d.m15541t(mg8Var10, toggleActivityUseCase$canChangeActivities$1);
                    if (objM15541t != obj) {
                        Boolean[] boolArr11 = boolArr4;
                        boolArr5 = boolArr11;
                        objArr5 = boolArr11;
                        objArr5[i9] = objM15541t;
                        mg8 mg8Var11 = ((C1370c) ig8Var).f18506R;
                        toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr5;
                        toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr5;
                        toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                        toggleActivityUseCase$canChangeActivities$1.f22876d = 4;
                        toggleActivityUseCase$canChangeActivities$1.f22879g = 5;
                        objM15541t = AbstractC3224d.m15541t(mg8Var11, toggleActivityUseCase$canChangeActivities$1);
                        if (objM15541t != obj) {
                            Object[] objArr14 = boolArr5;
                            objArr6 = objArr14;
                            objArr7 = objArr14;
                            objArr7[i8] = objM15541t;
                            listM23605K = vz1.m23605K(objArr6);
                            list = listM23605K;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                i5 = 0;
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                    }
                                }
                            } else {
                                it = list.iterator();
                                i5 = 0;
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                    }
                                }
                            }
                            return Boolean.valueOf(i5 != 1);
                        }
                    }
                }
                return obj;
            case 3:
                i10 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                z5 = toggleActivityUseCase$canChangeActivities$1.f22873a;
                Object[] objArr15 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Boolean[] boolArr12 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr4 = objArr15;
                boolArr4 = boolArr12;
                objArr4[i10] = objM15541t;
                mg8 mg8Var12 = ((C1370c) ig8Var).f18505Q;
                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr4;
                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr4;
                toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                toggleActivityUseCase$canChangeActivities$1.f22876d = 3;
                toggleActivityUseCase$canChangeActivities$1.f22879g = 4;
                objM15541t = AbstractC3224d.m15541t(mg8Var12, toggleActivityUseCase$canChangeActivities$1);
                if (objM15541t != obj) {
                    Boolean[] boolArr13 = boolArr4;
                    boolArr5 = boolArr13;
                    objArr5 = boolArr13;
                    objArr5[i9] = objM15541t;
                    mg8 mg8Var13 = ((C1370c) ig8Var).f18506R;
                    toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr5;
                    toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr5;
                    toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                    toggleActivityUseCase$canChangeActivities$1.f22876d = 4;
                    toggleActivityUseCase$canChangeActivities$1.f22879g = 5;
                    objM15541t = AbstractC3224d.m15541t(mg8Var13, toggleActivityUseCase$canChangeActivities$1);
                    if (objM15541t != obj) {
                        Object[] objArr16 = boolArr5;
                        objArr6 = objArr16;
                        objArr7 = objArr16;
                        objArr7[i8] = objM15541t;
                        listM23605K = vz1.m23605K(objArr6);
                        list = listM23605K;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            i5 = 0;
                            while (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                }
                            }
                        } else {
                            it = list.iterator();
                            i5 = 0;
                            while (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                }
                            }
                        }
                        return Boolean.valueOf(i5 != 1);
                    }
                }
                return obj;
            case 4:
                i9 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                z5 = toggleActivityUseCase$canChangeActivities$1.f22873a;
                Object[] objArr17 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Boolean[] boolArr14 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr5 = objArr17;
                boolArr5 = boolArr14;
                objArr5[i9] = objM15541t;
                mg8 mg8Var14 = ((C1370c) ig8Var).f18506R;
                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr5;
                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr5;
                toggleActivityUseCase$canChangeActivities$1.f22873a = z5;
                toggleActivityUseCase$canChangeActivities$1.f22876d = 4;
                toggleActivityUseCase$canChangeActivities$1.f22879g = 5;
                objM15541t = AbstractC3224d.m15541t(mg8Var14, toggleActivityUseCase$canChangeActivities$1);
                if (objM15541t != obj) {
                    Object[] objArr18 = boolArr5;
                    objArr6 = objArr18;
                    objArr7 = objArr18;
                    objArr7[i8] = objM15541t;
                    listM23605K = vz1.m23605K(objArr6);
                    list = listM23605K;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    } else {
                        it = list.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    }
                    return Boolean.valueOf(i5 != 1);
                }
                return obj;
            case 5:
                i8 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                Object[] objArr19 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Object[] objArr20 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr7 = objArr19;
                objArr6 = objArr20;
                objArr7[i8] = objM15541t;
                listM23605K = vz1.m23605K(objArr6);
                list = listM23605K;
                if (list instanceof Collection) {
                    it = list.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                } else {
                    it = list.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                }
                return Boolean.valueOf(i5 != 1);
            case 6:
                i = toggleActivityUseCase$canChangeActivities$1.f22876d;
                z2 = toggleActivityUseCase$canChangeActivities$1.f22873a;
                Object[] objArr21 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                Boolean[] boolArr15 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr = objArr21;
                boolArr = boolArr15;
                objArr[i] = objM15541t;
                mg8 mg8Var15 = ((C1370c) ig8Var).f18505Q;
                toggleActivityUseCase$canChangeActivities$1.f22874b = boolArr;
                toggleActivityUseCase$canChangeActivities$1.f22875c = boolArr;
                toggleActivityUseCase$canChangeActivities$1.f22873a = z2;
                toggleActivityUseCase$canChangeActivities$1.f22876d = 1;
                toggleActivityUseCase$canChangeActivities$1.f22879g = 7;
                objM15541t = AbstractC3224d.m15541t(mg8Var15, toggleActivityUseCase$canChangeActivities$1);
                if (objM15541t != obj) {
                    objArr8 = boolArr;
                    objArr9 = objArr8;
                    i4 = 1;
                    objArr8[i4] = objM15541t;
                    listM23605K = vz1.m23605K(objArr9);
                    list = listM23605K;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    } else {
                        it = list.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    }
                    return Boolean.valueOf(i5 != 1);
                }
                return obj;
            case 7:
                i4 = toggleActivityUseCase$canChangeActivities$1.f22876d;
                objArr8 = toggleActivityUseCase$canChangeActivities$1.f22875c;
                objArr9 = toggleActivityUseCase$canChangeActivities$1.f22874b;
                AbstractC3193b.m15359b(objM15541t);
                objArr8[i4] = objM15541t;
                listM23605K = vz1.m23605K(objArr9);
                list = listM23605K;
                if (list instanceof Collection) {
                    it = list.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                } else {
                    it = list.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                }
                return Boolean.valueOf(i5 != 1);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m8636b(ContinuationImpl continuationImpl) throws Throwable {
        ToggleActivityUseCase$canChangeStudySentence$1 toggleActivityUseCase$canChangeStudySentence$1;
        int i;
        Boolean[] boolArr;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        Boolean[] boolArr2;
        Object[] objArr3;
        Object[] objArr4;
        List listM23605K;
        Iterator it;
        int i3;
        if (continuationImpl instanceof ToggleActivityUseCase$canChangeStudySentence$1) {
            toggleActivityUseCase$canChangeStudySentence$1 = (ToggleActivityUseCase$canChangeStudySentence$1) continuationImpl;
            int i4 = toggleActivityUseCase$canChangeStudySentence$1.f22885f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                toggleActivityUseCase$canChangeStudySentence$1.f22885f = i4 - Integer.MIN_VALUE;
            } else {
                toggleActivityUseCase$canChangeStudySentence$1 = new ToggleActivityUseCase$canChangeStudySentence$1(this, continuationImpl);
            }
        } else {
            toggleActivityUseCase$canChangeStudySentence$1 = new ToggleActivityUseCase$canChangeStudySentence$1(this, continuationImpl);
        }
        Object objM15541t = toggleActivityUseCase$canChangeStudySentence$1.f22883d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = toggleActivityUseCase$canChangeStudySentence$1.f22885f;
        ig8 ig8Var = this.f22948a;
        int i6 = 2;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            Boolean[] boolArr3 = new Boolean[3];
            lg8 lg8Var = ((C1370c) ig8Var).f18546p0;
            toggleActivityUseCase$canChangeStudySentence$1.f22880a = boolArr3;
            toggleActivityUseCase$canChangeStudySentence$1.f22881b = boolArr3;
            toggleActivityUseCase$canChangeStudySentence$1.f22882c = 0;
            toggleActivityUseCase$canChangeStudySentence$1.f22885f = 1;
            objM15541t = AbstractC3224d.m15541t(lg8Var, toggleActivityUseCase$canChangeStudySentence$1);
            if (objM15541t != obj) {
                i = 0;
                boolArr = boolArr3;
                objArr = boolArr3;
            }
            return obj;
        }
        if (i5 == 1) {
            i = toggleActivityUseCase$canChangeStudySentence$1.f22882c;
            Object[] objArr5 = toggleActivityUseCase$canChangeStudySentence$1.f22881b;
            Boolean[] boolArr4 = toggleActivityUseCase$canChangeStudySentence$1.f22880a;
            AbstractC3193b.m15359b(objM15541t);
            objArr = objArr5;
            boolArr = boolArr4;
        } else {
            if (i5 == 2) {
                i2 = toggleActivityUseCase$canChangeStudySentence$1.f22882c;
                Object[] objArr6 = toggleActivityUseCase$canChangeStudySentence$1.f22881b;
                Boolean[] boolArr5 = toggleActivityUseCase$canChangeStudySentence$1.f22880a;
                AbstractC3193b.m15359b(objM15541t);
                objArr2 = objArr6;
                boolArr2 = boolArr5;
                objArr2[i2] = objM15541t;
                lg8 lg8Var2 = ((C1370c) ig8Var).f18550r0;
                toggleActivityUseCase$canChangeStudySentence$1.f22880a = boolArr2;
                toggleActivityUseCase$canChangeStudySentence$1.f22881b = boolArr2;
                toggleActivityUseCase$canChangeStudySentence$1.f22882c = 2;
                toggleActivityUseCase$canChangeStudySentence$1.f22885f = 3;
                objM15541t = AbstractC3224d.m15541t(lg8Var2, toggleActivityUseCase$canChangeStudySentence$1);
                if (objM15541t != obj) {
                    Object[] objArr7 = boolArr2;
                    objArr3 = objArr7;
                    objArr4 = objArr7;
                }
                return obj;
            }
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = toggleActivityUseCase$canChangeStudySentence$1.f22882c;
            Object[] objArr8 = toggleActivityUseCase$canChangeStudySentence$1.f22881b;
            Object[] objArr9 = toggleActivityUseCase$canChangeStudySentence$1.f22880a;
            AbstractC3193b.m15359b(objM15541t);
            objArr3 = objArr9;
            objArr4 = objArr8;
        }
        objArr4[i6] = objM15541t;
        listM23605K = vz1.m23605K(objArr3);
        if ((listM23605K instanceof Collection) || !listM23605K.isEmpty()) {
            it = listM23605K.iterator();
            i3 = 0;
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                    vz1.m23626d0();
                    throw null;
                }
            }
        } else {
            i3 = 0;
        }
        return Boolean.valueOf(i3 != 1);
        objArr[i] = objM15541t;
        lg8 lg8Var3 = ((C1370c) ig8Var).f18548q0;
        toggleActivityUseCase$canChangeStudySentence$1.f22880a = boolArr;
        toggleActivityUseCase$canChangeStudySentence$1.f22881b = boolArr;
        toggleActivityUseCase$canChangeStudySentence$1.f22882c = 1;
        toggleActivityUseCase$canChangeStudySentence$1.f22885f = 2;
        objM15541t = AbstractC3224d.m15541t(lg8Var3, toggleActivityUseCase$canChangeStudySentence$1);
        if (objM15541t != obj) {
            i2 = 1;
            objArr2 = boolArr;
            boolArr2 = boolArr;
            objArr2[i2] = objM15541t;
            lg8 lg8Var4 = ((C1370c) ig8Var).f18550r0;
            toggleActivityUseCase$canChangeStudySentence$1.f22880a = boolArr2;
            toggleActivityUseCase$canChangeStudySentence$1.f22881b = boolArr2;
            toggleActivityUseCase$canChangeStudySentence$1.f22882c = 2;
            toggleActivityUseCase$canChangeStudySentence$1.f22885f = 3;
            objM15541t = AbstractC3224d.m15541t(lg8Var4, toggleActivityUseCase$canChangeStudySentence$1);
            if (objM15541t != obj) {
                Object[] objArr10 = boolArr2;
                objArr3 = objArr10;
                objArr4 = objArr10;
                objArr4[i6] = objM15541t;
                listM23605K = vz1.m23605K(objArr3);
                if (listM23605K instanceof Collection) {
                    it = listM23605K.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                } else {
                    it = listM23605K.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                }
                return Boolean.valueOf(i3 != 1);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bf A[PHI: r12 r13 r14
      0x00bf: PHI (r12v2 com.lingq.core.settings.ViewKeys) = (r12v0 com.lingq.core.settings.ViewKeys), (r12v4 com.lingq.core.settings.ViewKeys) binds: [B:23:0x0064, B:34:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r13v2 boolean) = (r13v0 boolean), (r13v3 boolean) binds: [B:23:0x0064, B:34:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r14v2 boolean) = (r14v0 boolean), (r14v4 boolean) binds: [B:23:0x0064, B:34:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r15 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r15 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        if (r11 == r1) goto L58;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8637c(ViewKeys viewKeys, boolean z, boolean z2, ContinuationImpl continuationImpl) throws Throwable {
        ToggleActivityUseCase$invoke$1 toggleActivityUseCase$invoke$1;
        boolean zBooleanValue;
        String str;
        ViewKeys viewKeys2;
        boolean z3;
        ViewKeys viewKeys3;
        String str2;
        Object objM8616b;
        if (continuationImpl instanceof ToggleActivityUseCase$invoke$1) {
            toggleActivityUseCase$invoke$1 = (ToggleActivityUseCase$invoke$1) continuationImpl;
            int i = toggleActivityUseCase$invoke$1.f22891f;
            if ((i & Integer.MIN_VALUE) != 0) {
                toggleActivityUseCase$invoke$1.f22891f = i - Integer.MIN_VALUE;
            } else {
                toggleActivityUseCase$invoke$1 = new ToggleActivityUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            toggleActivityUseCase$invoke$1 = new ToggleActivityUseCase$invoke$1(this, continuationImpl);
        }
        Object objM8635a = toggleActivityUseCase$invoke$1.f22889d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = toggleActivityUseCase$invoke$1.f22891f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8635a);
            if (z) {
                str = (String) f22947d.get(viewKeys);
                if (str != null) {
                    ((C1240a) this.f22950c).m7025f("Review setting changed", g9a.m12429f("setting changed", str));
                }
                toggleActivityUseCase$invoke$1.f22886a = viewKeys;
                toggleActivityUseCase$invoke$1.f22887b = z;
                toggleActivityUseCase$invoke$1.f22888c = z2;
                toggleActivityUseCase$invoke$1.f22891f = 4;
                if (m8638d(viewKeys, z, toggleActivityUseCase$invoke$1) != obj) {
                    boolean z4 = z2;
                    viewKeys2 = viewKeys;
                    z3 = z4;
                    toggleActivityUseCase$invoke$1.f22886a = null;
                    toggleActivityUseCase$invoke$1.f22887b = z;
                    toggleActivityUseCase$invoke$1.f22888c = z3;
                    toggleActivityUseCase$invoke$1.f22891f = 5;
                    ProfileSettingType profileSettingType = new ProfileSettingType();
                    if (z) {
                        str2 = "off";
                    } else {
                        str2 = "on";
                    }
                    profileSettingType.f19719c = str2;
                    objM8616b = this.f22949b.m8616b(viewKeys2, profileSettingType, toggleActivityUseCase$invoke$1);
                    if (objM8616b != obj) {
                        objM8616b = xfa.f68157a;
                    }
                }
            } else if (AbstractC3550rv.m20855w0(new ViewKeys[]{ViewKeys.Unscramble, ViewKeys.Speaking, ViewKeys.Matching}).contains(viewKeys)) {
                toggleActivityUseCase$invoke$1.f22886a = viewKeys;
                toggleActivityUseCase$invoke$1.f22887b = z;
                toggleActivityUseCase$invoke$1.f22888c = z2;
                toggleActivityUseCase$invoke$1.f22891f = 1;
                objM8635a = m8636b(toggleActivityUseCase$invoke$1);
            } else {
                toggleActivityUseCase$invoke$1.f22886a = viewKeys;
                toggleActivityUseCase$invoke$1.f22887b = z;
                toggleActivityUseCase$invoke$1.f22888c = z2;
                toggleActivityUseCase$invoke$1.f22891f = 2;
                objM8635a = m8635a(z2, toggleActivityUseCase$invoke$1);
            }
            return obj;
        }
        if (i2 == 1) {
            z2 = toggleActivityUseCase$invoke$1.f22888c;
            z = toggleActivityUseCase$invoke$1.f22887b;
            viewKeys = toggleActivityUseCase$invoke$1.f22886a;
            AbstractC3193b.m15359b(objM8635a);
            zBooleanValue = ((Boolean) objM8635a).booleanValue();
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    viewKeys3 = toggleActivityUseCase$invoke$1.f22886a;
                    AbstractC3193b.m15359b(objM8635a);
                    return new u1a(viewKeys3);
                }
                if (i2 == 4) {
                    z3 = toggleActivityUseCase$invoke$1.f22888c;
                    z = toggleActivityUseCase$invoke$1.f22887b;
                    viewKeys2 = toggleActivityUseCase$invoke$1.f22886a;
                    AbstractC3193b.m15359b(objM8635a);
                    toggleActivityUseCase$invoke$1.f22886a = null;
                    toggleActivityUseCase$invoke$1.f22887b = z;
                    toggleActivityUseCase$invoke$1.f22888c = z3;
                    toggleActivityUseCase$invoke$1.f22891f = 5;
                    ProfileSettingType profileSettingType2 = new ProfileSettingType();
                    if (z) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    profileSettingType2.f19719c = str2;
                    objM8616b = this.f22949b.m8616b(viewKeys2, profileSettingType2, toggleActivityUseCase$invoke$1);
                    if (objM8616b != obj) {
                        objM8616b = xfa.f68157a;
                    }
                } else {
                    if (i2 != 5) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(objM8635a);
                }
                return v1a.f64711a;
            }
            z2 = toggleActivityUseCase$invoke$1.f22888c;
            z = toggleActivityUseCase$invoke$1.f22887b;
            viewKeys = toggleActivityUseCase$invoke$1.f22886a;
            AbstractC3193b.m15359b(objM8635a);
            zBooleanValue = ((Boolean) objM8635a).booleanValue();
        }
        if (zBooleanValue) {
            str = (String) f22947d.get(viewKeys);
            if (str != null) {
                ((C1240a) this.f22950c).m7025f("Review setting changed", g9a.m12429f("setting changed", str));
            }
            toggleActivityUseCase$invoke$1.f22886a = viewKeys;
            toggleActivityUseCase$invoke$1.f22887b = z;
            toggleActivityUseCase$invoke$1.f22888c = z2;
            toggleActivityUseCase$invoke$1.f22891f = 4;
            if (m8638d(viewKeys, z, toggleActivityUseCase$invoke$1) != obj) {
                boolean z5 = z2;
                viewKeys2 = viewKeys;
                z3 = z5;
                toggleActivityUseCase$invoke$1.f22886a = null;
                toggleActivityUseCase$invoke$1.f22887b = z;
                toggleActivityUseCase$invoke$1.f22888c = z3;
                toggleActivityUseCase$invoke$1.f22891f = 5;
                ProfileSettingType profileSettingType3 = new ProfileSettingType();
                if (z) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                profileSettingType3.f19719c = str2;
                objM8616b = this.f22949b.m8616b(viewKeys2, profileSettingType3, toggleActivityUseCase$invoke$1);
                if (objM8616b != obj) {
                    objM8616b = xfa.f68157a;
                }
            }
        } else {
            toggleActivityUseCase$invoke$1.f22886a = viewKeys;
            toggleActivityUseCase$invoke$1.f22887b = z;
            toggleActivityUseCase$invoke$1.f22888c = z2;
            toggleActivityUseCase$invoke$1.f22891f = 3;
            if (m8638d(viewKeys, true, toggleActivityUseCase$invoke$1) != obj) {
                viewKeys3 = viewKeys;
                return new u1a(viewKeys3);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final Object m8638d(ViewKeys viewKeys, boolean z, Continuation continuation) {
        int i = x1a.f67649a[viewKeys.ordinal()];
        ig8 ig8Var = this.f22948a;
        switch (i) {
            case 1:
                Object objM7940f = ((C1370c) ig8Var).m7940f(z, (ContinuationImpl) continuation);
                if (objM7940f == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7940f;
                }
                break;
            case 2:
                Object objM7952r = ((C1370c) ig8Var).m7952r(z, (ContinuationImpl) continuation);
                if (objM7952r == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7952r;
                }
                break;
            case 3:
                Object objM7938d = ((C1370c) ig8Var).m7938d(z, continuation);
                if (objM7938d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7938d;
                }
                break;
            case 4:
                Object objM7930E = ((C1370c) ig8Var).m7930E(z, continuation);
                if (objM7930E == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7930E;
                }
                break;
            case 5:
                Object objM7939e = ((C1370c) ig8Var).m7939e(z, continuation);
                if (objM7939e == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7939e;
                }
                break;
            case 6:
                Object objM7932G = ((C1370c) ig8Var).m7932G(z, continuation);
                if (objM7932G == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7932G;
                }
                break;
            case 7:
                Object objM7931F = ((C1370c) ig8Var).m7931F(z, continuation);
                if (objM7931F == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7931F;
                }
                break;
            case 8:
                Object objM7929D = ((C1370c) ig8Var).m7929D(z, continuation);
                if (objM7929D == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM7929D;
                }
                break;
        }
        return xfa.f68157a;
    }
}
