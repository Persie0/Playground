package com.lingq.core.domain.playlist;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3713w8;
import p000.c83;
import p000.d65;
import p000.kk8;
import p000.xd7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1518a {

    /* JADX INFO: renamed from: a */
    public final d65 f19933a;

    /* JADX INFO: renamed from: b */
    public final xd7 f19934b;

    /* JADX INFO: renamed from: c */
    public final C3713w8 f19935c;

    public C1518a(d65 d65Var, xd7 xd7Var, C3713w8 c3713w8) {
        d65Var.getClass();
        xd7Var.getClass();
        this.f19933a = d65Var;
        this.f19934b = xd7Var;
        this.f19935c = c3713w8;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0 A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, PHI: r1 r4 r11
      0x00e0: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v13 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:39:0x00a4, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v8 java.lang.String) binds: [B:39:0x00a4, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r11v7 int) = (r11v3 int), (r11v8 int) binds: [B:39:0x00a4, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9 A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, PHI: r1 r11 r12 r13
      0x00f9: PHI (r1v15 java.lang.String) = (r1v12 java.lang.String), (r1v19 java.lang.String) binds: [B:53:0x00f5, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r11v10 int) = (r11v7 int), (r11v11 int) binds: [B:53:0x00f5, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r12v19 kotlin.jvm.internal.Ref$ObjectRef) = (r12v15 kotlin.jvm.internal.Ref$ObjectRef), (r12v21 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:53:0x00f5, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r13v14 java.lang.Object) = (r13v11 java.lang.Object), (r13v1 java.lang.Object) binds: [B:53:0x00f5, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122 A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012c A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0136 A[Catch: Exception -> 0x0036, CancellationException -> 0x0194, TryCatch #2 {CancellationException -> 0x0194, Exception -> 0x0036, blocks: (B:14:0x0032, B:19:0x0042, B:62:0x011c, B:64:0x0122, B:73:0x0147, B:76:0x015f, B:67:0x012c, B:68:0x0130, B:70:0x0136, B:22:0x004d, B:55:0x00f9, B:58:0x00ff, B:25:0x005c, B:48:0x00d8, B:51:0x00de, B:52:0x00e0, B:28:0x0067, B:44:0x00bd, B:31:0x0076, B:38:0x00a0, B:40:0x00a6, B:34:0x007d), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:68:0x0130->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m8194a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        AddCompletedLessonToActivePlaylistUseCase$invoke$1 addCompletedLessonToActivePlaylistUseCase$invoke$1;
        String str2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        String str3;
        Playlist playlist;
        LessonInfo lessonInfo;
        Object objM15541t;
        Ref$ObjectRef ref$ObjectRef5;
        LessonInfo lessonInfo2;
        Iterable iterable;
        Iterator it;
        String str4;
        Object objM7345e;
        if (continuationImpl instanceof AddCompletedLessonToActivePlaylistUseCase$invoke$1) {
            addCompletedLessonToActivePlaylistUseCase$invoke$1 = (AddCompletedLessonToActivePlaylistUseCase$invoke$1) continuationImpl;
            int i2 = addCompletedLessonToActivePlaylistUseCase$invoke$1.f19888g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addCompletedLessonToActivePlaylistUseCase$invoke$1.f19888g = i2 - Integer.MIN_VALUE;
            } else {
                addCompletedLessonToActivePlaylistUseCase$invoke$1 = new AddCompletedLessonToActivePlaylistUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            addCompletedLessonToActivePlaylistUseCase$invoke$1 = new AddCompletedLessonToActivePlaylistUseCase$invoke$1(this, continuationImpl);
        }
        AddCompletedLessonToActivePlaylistUseCase$invoke$1 addCompletedLessonToActivePlaylistUseCase$invoke$2 = addCompletedLessonToActivePlaylistUseCase$invoke$1;
        Object objM15542u = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19886e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g;
        xfa xfaVar = xfa.f68157a;
        xd7 xd7Var = this.f19934b;
        try {
            switch (i3) {
                case 0:
                    AbstractC3193b.m15359b(objM15542u);
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    kk8 kk8VarM7355o = ((C1302r) xd7Var).m7355o(str);
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef6;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = ref$ObjectRef6;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 1;
                    Object objM15542u2 = AbstractC3224d.m15542u(kk8VarM7355o, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                    if (objM15542u2 != coroutineSingletons) {
                        str2 = str;
                        ref$ObjectRef = ref$ObjectRef6;
                        objM15542u = objM15542u2;
                        ref$ObjectRef2 = ref$ObjectRef;
                        ref$ObjectRef.f47718a = objM15542u;
                        if (ref$ObjectRef2.f47718a == null) {
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str2;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef2;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 2;
                            if (((C1302r) xd7Var).m7354n(str2, addCompletedLessonToActivePlaylistUseCase$invoke$2) == coroutineSingletons) {
                                ref$ObjectRef3 = ref$ObjectRef2;
                                kk8 kk8VarM7355o2 = ((C1302r) xd7Var).m7355o(str2);
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str2;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef3;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = ref$ObjectRef3;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 3;
                                objM15542u = AbstractC3224d.m15542u(kk8VarM7355o2, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                if (objM15542u != coroutineSingletons) {
                                    ref$ObjectRef2 = ref$ObjectRef3;
                                    playlist = (Playlist) objM15542u;
                                    if (playlist == null) {
                                        ref$ObjectRef3.f47718a = playlist;
                                        ref$ObjectRef4 = ref$ObjectRef2;
                                        str3 = str2;
                                        d65 d65Var = this.f19933a;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                                        objM15542u = ((C1295k) d65Var).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                        if (objM15542u == coroutineSingletons) {
                                            lessonInfo = (LessonInfo) objM15542u;
                                            if (lessonInfo != null) {
                                                c83 c83VarM7359s = ((C1302r) xd7Var).m7359s(i, str3);
                                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                                objM15541t = AbstractC3224d.m15541t(c83VarM7359s, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                                if (objM15541t != coroutineSingletons) {
                                                    ref$ObjectRef5 = ref$ObjectRef4;
                                                    lessonInfo2 = lessonInfo;
                                                    objM15542u = objM15541t;
                                                    iterable = (Iterable) objM15542u;
                                                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                                        it = iterable.iterator();
                                                        while (it.hasNext()) {
                                                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                            }
                                                        }
                                                    }
                                                    C3713w8 c3713w8 = this.f19935c;
                                                    Object obj = ref$ObjectRef5.f47718a;
                                                    String str5 = ((Playlist) obj).f19554b;
                                                    int i4 = ((Playlist) obj).f19556d;
                                                    String str6 = ((Playlist) obj).f19553a;
                                                    str4 = lessonInfo2.f19353I;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    int i5 = lessonInfo2.f19365a;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                                    objM7345e = ((C1302r) c3713w8.f66505a).m7345e(i4, i5, str5, str6, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                                    if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM7345e = xfaVar;
                                                    }
                                                    if (objM7345e == coroutineSingletons) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return xfaVar;
                                }
                            }
                        } else {
                            ref$ObjectRef4 = ref$ObjectRef2;
                            str3 = str2;
                            d65 d65Var2 = this.f19933a;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                            objM15542u = ((C1295k) d65Var2).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                            if (objM15542u == coroutineSingletons) {
                                lessonInfo = (LessonInfo) objM15542u;
                                if (lessonInfo != null) {
                                    c83 c83VarM7359s2 = ((C1302r) xd7Var).m7359s(i, str3);
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                    objM15541t = AbstractC3224d.m15541t(c83VarM7359s2, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                    if (objM15541t != coroutineSingletons) {
                                        ref$ObjectRef5 = ref$ObjectRef4;
                                        lessonInfo2 = lessonInfo;
                                        objM15542u = objM15541t;
                                        iterable = (Iterable) objM15542u;
                                        if (iterable instanceof Collection) {
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                }
                                            }
                                            C3713w8 c3713w9 = this.f19935c;
                                            Object obj2 = ref$ObjectRef5.f47718a;
                                            String str7 = ((Playlist) obj2).f19554b;
                                            int i6 = ((Playlist) obj2).f19556d;
                                            String str8 = ((Playlist) obj2).f19553a;
                                            str4 = lessonInfo2.f19353I;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            int i7 = lessonInfo2.f19365a;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                            objM7345e = ((C1302r) c3713w9.f66505a).m7345e(i6, i7, str7, str8, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                            if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM7345e = xfaVar;
                                            }
                                            if (objM7345e == coroutineSingletons) {
                                            }
                                        } else {
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                }
                                            }
                                            C3713w8 c3713w10 = this.f19935c;
                                            Object obj3 = ref$ObjectRef5.f47718a;
                                            String str9 = ((Playlist) obj3).f19554b;
                                            int i8 = ((Playlist) obj3).f19556d;
                                            String str10 = ((Playlist) obj3).f19553a;
                                            str4 = lessonInfo2.f19353I;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            int i9 = lessonInfo2.f19365a;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                            objM7345e = ((C1302r) c3713w10.f66505a).m7345e(i8, i9, str9, str10, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                            if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM7345e = xfaVar;
                                            }
                                            if (objM7345e == coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    i = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d;
                    ref$ObjectRef = (Ref$ObjectRef) addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c;
                    ref$ObjectRef2 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b;
                    str2 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a;
                    AbstractC3193b.m15359b(objM15542u);
                    ref$ObjectRef.f47718a = objM15542u;
                    if (ref$ObjectRef2.f47718a == null) {
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str2;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef2;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 2;
                        if (((C1302r) xd7Var).m7354n(str2, addCompletedLessonToActivePlaylistUseCase$invoke$2) == coroutineSingletons) {
                            ref$ObjectRef3 = ref$ObjectRef2;
                            kk8 kk8VarM7355o3 = ((C1302r) xd7Var).m7355o(str2);
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str2;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef3;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = ref$ObjectRef3;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 3;
                            objM15542u = AbstractC3224d.m15542u(kk8VarM7355o3, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                            if (objM15542u != coroutineSingletons) {
                                ref$ObjectRef2 = ref$ObjectRef3;
                                playlist = (Playlist) objM15542u;
                                if (playlist == null) {
                                    ref$ObjectRef3.f47718a = playlist;
                                    ref$ObjectRef4 = ref$ObjectRef2;
                                    str3 = str2;
                                    d65 d65Var3 = this.f19933a;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                                    objM15542u = ((C1295k) d65Var3).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                    if (objM15542u == coroutineSingletons) {
                                        lessonInfo = (LessonInfo) objM15542u;
                                        if (lessonInfo != null) {
                                            c83 c83VarM7359s3 = ((C1302r) xd7Var).m7359s(i, str3);
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                            objM15541t = AbstractC3224d.m15541t(c83VarM7359s3, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                            if (objM15541t != coroutineSingletons) {
                                                ref$ObjectRef5 = ref$ObjectRef4;
                                                lessonInfo2 = lessonInfo;
                                                objM15542u = objM15541t;
                                                iterable = (Iterable) objM15542u;
                                                if (iterable instanceof Collection) {
                                                    it = iterable.iterator();
                                                    while (it.hasNext()) {
                                                        if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                        }
                                                    }
                                                    C3713w8 c3713w11 = this.f19935c;
                                                    Object obj4 = ref$ObjectRef5.f47718a;
                                                    String str11 = ((Playlist) obj4).f19554b;
                                                    int i10 = ((Playlist) obj4).f19556d;
                                                    String str12 = ((Playlist) obj4).f19553a;
                                                    str4 = lessonInfo2.f19353I;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    int i11 = lessonInfo2.f19365a;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                                    objM7345e = ((C1302r) c3713w11.f66505a).m7345e(i10, i11, str11, str12, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                                    if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM7345e = xfaVar;
                                                    }
                                                    if (objM7345e == coroutineSingletons) {
                                                    }
                                                } else {
                                                    it = iterable.iterator();
                                                    while (it.hasNext()) {
                                                        if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                        }
                                                    }
                                                    C3713w8 c3713w12 = this.f19935c;
                                                    Object obj5 = ref$ObjectRef5.f47718a;
                                                    String str13 = ((Playlist) obj5).f19554b;
                                                    int i12 = ((Playlist) obj5).f19556d;
                                                    String str14 = ((Playlist) obj5).f19553a;
                                                    str4 = lessonInfo2.f19353I;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    int i13 = lessonInfo2.f19365a;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                                    objM7345e = ((C1302r) c3713w12.f66505a).m7345e(i12, i13, str13, str14, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                                    if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM7345e = xfaVar;
                                                    }
                                                    if (objM7345e == coroutineSingletons) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    } else {
                        ref$ObjectRef4 = ref$ObjectRef2;
                        str3 = str2;
                        d65 d65Var4 = this.f19933a;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                        objM15542u = ((C1295k) d65Var4).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                        if (objM15542u == coroutineSingletons) {
                            lessonInfo = (LessonInfo) objM15542u;
                            if (lessonInfo != null) {
                                c83 c83VarM7359s4 = ((C1302r) xd7Var).m7359s(i, str3);
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                objM15541t = AbstractC3224d.m15541t(c83VarM7359s4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                if (objM15541t != coroutineSingletons) {
                                    ref$ObjectRef5 = ref$ObjectRef4;
                                    lessonInfo2 = lessonInfo;
                                    objM15542u = objM15541t;
                                    iterable = (Iterable) objM15542u;
                                    if (iterable instanceof Collection) {
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                            }
                                        }
                                        C3713w8 c3713w13 = this.f19935c;
                                        Object obj6 = ref$ObjectRef5.f47718a;
                                        String str15 = ((Playlist) obj6).f19554b;
                                        int i14 = ((Playlist) obj6).f19556d;
                                        String str16 = ((Playlist) obj6).f19553a;
                                        str4 = lessonInfo2.f19353I;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        int i15 = lessonInfo2.f19365a;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                        objM7345e = ((C1302r) c3713w13.f66505a).m7345e(i14, i15, str15, str16, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM7345e = xfaVar;
                                        }
                                        if (objM7345e == coroutineSingletons) {
                                        }
                                    } else {
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                            }
                                        }
                                        C3713w8 c3713w14 = this.f19935c;
                                        Object obj7 = ref$ObjectRef5.f47718a;
                                        String str17 = ((Playlist) obj7).f19554b;
                                        int i16 = ((Playlist) obj7).f19556d;
                                        String str18 = ((Playlist) obj7).f19553a;
                                        str4 = lessonInfo2.f19353I;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        int i17 = lessonInfo2.f19365a;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                        objM7345e = ((C1302r) c3713w14.f66505a).m7345e(i16, i17, str17, str18, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM7345e = xfaVar;
                                        }
                                        if (objM7345e == coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                            return xfaVar;
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    i = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d;
                    ref$ObjectRef3 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b;
                    String str19 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a;
                    AbstractC3193b.m15359b(objM15542u);
                    str2 = str19;
                    kk8 kk8VarM7355o4 = ((C1302r) xd7Var).m7355o(str2);
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str2;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef3;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = ref$ObjectRef3;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 3;
                    objM15542u = AbstractC3224d.m15542u(kk8VarM7355o4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                    if (objM15542u != coroutineSingletons) {
                        ref$ObjectRef2 = ref$ObjectRef3;
                        playlist = (Playlist) objM15542u;
                        if (playlist == null) {
                            ref$ObjectRef3.f47718a = playlist;
                            ref$ObjectRef4 = ref$ObjectRef2;
                            str3 = str2;
                            d65 d65Var5 = this.f19933a;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                            objM15542u = ((C1295k) d65Var5).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                            if (objM15542u == coroutineSingletons) {
                                lessonInfo = (LessonInfo) objM15542u;
                                if (lessonInfo != null) {
                                    c83 c83VarM7359s5 = ((C1302r) xd7Var).m7359s(i, str3);
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                    addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                    objM15541t = AbstractC3224d.m15541t(c83VarM7359s5, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                    if (objM15541t != coroutineSingletons) {
                                        ref$ObjectRef5 = ref$ObjectRef4;
                                        lessonInfo2 = lessonInfo;
                                        objM15542u = objM15541t;
                                        iterable = (Iterable) objM15542u;
                                        if (iterable instanceof Collection) {
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                }
                                            }
                                            C3713w8 c3713w15 = this.f19935c;
                                            Object obj8 = ref$ObjectRef5.f47718a;
                                            String str110 = ((Playlist) obj8).f19554b;
                                            int i18 = ((Playlist) obj8).f19556d;
                                            String str111 = ((Playlist) obj8).f19553a;
                                            str4 = lessonInfo2.f19353I;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            int i19 = lessonInfo2.f19365a;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                            objM7345e = ((C1302r) c3713w15.f66505a).m7345e(i18, i19, str110, str111, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                            if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM7345e = xfaVar;
                                            }
                                            if (objM7345e == coroutineSingletons) {
                                            }
                                        } else {
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                                }
                                            }
                                            C3713w8 c3713w16 = this.f19935c;
                                            Object obj9 = ref$ObjectRef5.f47718a;
                                            String str112 = ((Playlist) obj9).f19554b;
                                            int i110 = ((Playlist) obj9).f19556d;
                                            String str113 = ((Playlist) obj9).f19553a;
                                            str4 = lessonInfo2.f19353I;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            int i111 = lessonInfo2.f19365a;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                            addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                            objM7345e = ((C1302r) c3713w16.f66505a).m7345e(i110, i111, str112, str113, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                            if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM7345e = xfaVar;
                                            }
                                            if (objM7345e == coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return xfaVar;
                    }
                    return coroutineSingletons;
                case 3:
                    i = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d;
                    ref$ObjectRef3 = (Ref$ObjectRef) addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c;
                    ref$ObjectRef2 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b;
                    str2 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a;
                    AbstractC3193b.m15359b(objM15542u);
                    playlist = (Playlist) objM15542u;
                    if (playlist == null) {
                        ref$ObjectRef3.f47718a = playlist;
                        ref$ObjectRef4 = ref$ObjectRef2;
                        str3 = str2;
                        d65 d65Var6 = this.f19933a;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = str3;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 4;
                        objM15542u = ((C1295k) d65Var6).m7245C(i, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                        if (objM15542u == coroutineSingletons) {
                            lessonInfo = (LessonInfo) objM15542u;
                            if (lessonInfo != null) {
                                c83 c83VarM7359s6 = ((C1302r) xd7Var).m7359s(i, str3);
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                                objM15541t = AbstractC3224d.m15541t(c83VarM7359s6, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                if (objM15541t != coroutineSingletons) {
                                    ref$ObjectRef5 = ref$ObjectRef4;
                                    lessonInfo2 = lessonInfo;
                                    objM15542u = objM15541t;
                                    iterable = (Iterable) objM15542u;
                                    if (iterable instanceof Collection) {
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                            }
                                        }
                                        C3713w8 c3713w17 = this.f19935c;
                                        Object obj10 = ref$ObjectRef5.f47718a;
                                        String str114 = ((Playlist) obj10).f19554b;
                                        int i112 = ((Playlist) obj10).f19556d;
                                        String str115 = ((Playlist) obj10).f19553a;
                                        str4 = lessonInfo2.f19353I;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        int i113 = lessonInfo2.f19365a;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                        objM7345e = ((C1302r) c3713w17.f66505a).m7345e(i112, i113, str114, str115, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM7345e = xfaVar;
                                        }
                                        if (objM7345e == coroutineSingletons) {
                                        }
                                    } else {
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                            }
                                        }
                                        C3713w8 c3713w18 = this.f19935c;
                                        Object obj11 = ref$ObjectRef5.f47718a;
                                        String str116 = ((Playlist) obj11).f19554b;
                                        int i114 = ((Playlist) obj11).f19556d;
                                        String str117 = ((Playlist) obj11).f19553a;
                                        str4 = lessonInfo2.f19353I;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        int i115 = lessonInfo2.f19365a;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                        objM7345e = ((C1302r) c3713w18.f66505a).m7345e(i114, i115, str116, str117, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM7345e = xfaVar;
                                        }
                                        if (objM7345e == coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    return xfaVar;
                case 4:
                    i = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d;
                    ref$ObjectRef4 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b;
                    str3 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a;
                    AbstractC3193b.m15359b(objM15542u);
                    lessonInfo = (LessonInfo) objM15542u;
                    if (lessonInfo != null) {
                        c83 c83VarM7359s7 = ((C1302r) xd7Var).m7359s(i, str3);
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = ref$ObjectRef4;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = lessonInfo;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 5;
                        objM15541t = AbstractC3224d.m15541t(c83VarM7359s7, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                        if (objM15541t != coroutineSingletons) {
                            ref$ObjectRef5 = ref$ObjectRef4;
                            lessonInfo2 = lessonInfo;
                            objM15542u = objM15541t;
                            iterable = (Iterable) objM15542u;
                            if (iterable instanceof Collection) {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                    }
                                }
                                C3713w8 c3713w19 = this.f19935c;
                                Object obj12 = ref$ObjectRef5.f47718a;
                                String str118 = ((Playlist) obj12).f19554b;
                                int i116 = ((Playlist) obj12).f19556d;
                                String str119 = ((Playlist) obj12).f19553a;
                                str4 = lessonInfo2.f19353I;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                int i117 = lessonInfo2.f19365a;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                objM7345e = ((C1302r) c3713w19.f66505a).m7345e(i116, i117, str118, str119, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM7345e = xfaVar;
                                }
                                if (objM7345e == coroutineSingletons) {
                                }
                            } else {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                                    }
                                }
                                C3713w8 c3713w110 = this.f19935c;
                                Object obj13 = ref$ObjectRef5.f47718a;
                                String str1110 = ((Playlist) obj13).f19554b;
                                int i118 = ((Playlist) obj13).f19556d;
                                String str1111 = ((Playlist) obj13).f19553a;
                                str4 = lessonInfo2.f19353I;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                int i119 = lessonInfo2.f19365a;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                                addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                                objM7345e = ((C1302r) c3713w110.f66505a).m7345e(i118, i119, str1110, str1111, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                                if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM7345e = xfaVar;
                                }
                                if (objM7345e == coroutineSingletons) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    return xfaVar;
                case 5:
                    i = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d;
                    lessonInfo2 = (LessonInfo) addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c;
                    ref$ObjectRef5 = addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b;
                    AbstractC3193b.m15359b(objM15542u);
                    iterable = (Iterable) objM15542u;
                    if (iterable instanceof Collection) {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                            }
                        }
                        C3713w8 c3713w111 = this.f19935c;
                        Object obj14 = ref$ObjectRef5.f47718a;
                        String str1112 = ((Playlist) obj14).f19554b;
                        int i1110 = ((Playlist) obj14).f19556d;
                        String str1113 = ((Playlist) obj14).f19553a;
                        str4 = lessonInfo2.f19353I;
                        if (str4 == null) {
                            str4 = "";
                        }
                        int i1111 = lessonInfo2.f19365a;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                        objM7345e = ((C1302r) c3713w111.f66505a).m7345e(i1110, i1111, str1112, str1113, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM7345e = xfaVar;
                        }
                        if (objM7345e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((Playlist) it.next()).f19556d == ((Playlist) ref$ObjectRef5.f47718a).f19556d) {
                            }
                        }
                        C3713w8 c3713w112 = this.f19935c;
                        Object obj15 = ref$ObjectRef5.f47718a;
                        String str1114 = ((Playlist) obj15).f19554b;
                        int i1112 = ((Playlist) obj15).f19556d;
                        String str1115 = ((Playlist) obj15).f19553a;
                        str4 = lessonInfo2.f19353I;
                        if (str4 == null) {
                            str4 = "";
                        }
                        int i1113 = lessonInfo2.f19365a;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19882a = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19883b = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19884c = null;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19885d = i;
                        addCompletedLessonToActivePlaylistUseCase$invoke$2.f19888g = 6;
                        objM7345e = ((C1302r) c3713w112.f66505a).m7345e(i1112, i1113, str1114, str1115, str4, addCompletedLessonToActivePlaylistUseCase$invoke$2);
                        if (objM7345e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM7345e = xfaVar;
                        }
                        if (objM7345e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return xfaVar;
                case 6:
                    AbstractC3193b.m15359b(objM15542u);
                    return xfaVar;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            System.out.println((Object) AbstractC3393o1.m17734i("E/LingQ: ", e2.getMessage()));
            e2.printStackTrace();
            return xfaVar;
        }
    }
}
