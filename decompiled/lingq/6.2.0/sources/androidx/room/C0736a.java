package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3489q9;
import p000.C3288l7;
import p000.C3386nv;
import p000.C3757xf;
import p000.c83;
import p000.kk8;
import p000.xfa;

/* JADX INFO: renamed from: androidx.room.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0736a {

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f6817a;

    /* JADX INFO: renamed from: b */
    public final C0750h f6818b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f6819c;

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f6820d;

    /* JADX INFO: renamed from: e */
    public final C3288l7 f6821e;

    /* JADX INFO: renamed from: f */
    public final C3288l7 f6822f;

    /* JADX INFO: renamed from: g */
    public final Object f6823g;

    public C0736a(AbstractC0746d abstractC0746d, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f6817a = abstractC0746d;
        C0750h c0750h = new C0750h(abstractC0746d, linkedHashMap, linkedHashMap2, strArr, abstractC0746d.f6964k, new InvalidationTracker$implementation$1(1, this, C0736a.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.f6818b = c0750h;
        this.f6819c = new LinkedHashMap();
        this.f6820d = new ReentrantLock();
        this.f6821e = new C3288l7(this, 27);
        this.f6822f = new C3288l7(this, 28);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.f6823g = new Object();
        c0750h.f6983k = new C3757xf(this, 17);
    }

    /* JADX INFO: renamed from: a */
    public final c83 m2808a(String[] strArr) {
        Pair pair;
        C0750h c0750h = this.f6818b;
        c0750h.getClass();
        strArr.getClass();
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            LinkedHashMap linkedHashMap = c0750h.f6975c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC3489q9.m19776f(setBuilder).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap2 = c0750h.f6978f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                C3386nv.m17626m("There is no table with name ".concat(str2));
                pair = null;
                String[] strArr3 = (String[]) pair.f47623a;
                int[] iArr2 = (int[]) pair.f47624b;
                strArr3.getClass();
                iArr2.getClass();
                return new kk8(new TriggerBasedInvalidationTracker$createFlow$1(c0750h, iArr2, strArr3, null));
            }
            iArr[i] = num.intValue();
        }
        pair = new Pair(strArr2, iArr);
        String[] strArr4 = (String[]) pair.f47623a;
        int[] iArr3 = (int[]) pair.f47624b;
        strArr4.getClass();
        iArr3.getClass();
        return new kk8(new TriggerBasedInvalidationTracker$createFlow$1(c0750h, iArr3, strArr4, null));
    }

    /* JADX INFO: renamed from: b */
    public final Object m2809b(SuspendLambda suspendLambda) {
        Object objM2857f = this.f6818b.m2857f(suspendLambda);
        return objM2857f == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2857f : xfa.f68157a;
    }
}
