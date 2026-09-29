package androidx.room;

import java.util.ArrayList;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.e83;
import p000.u91;
import p000.xfa;

/* JADX INFO: renamed from: androidx.room.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0749g implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$ObjectRef f6968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f6969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String[] f6970c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int[] f6971d;

    public C0749g(Ref$ObjectRef ref$ObjectRef, e83 e83Var, String[] strArr, int[] iArr) {
        this.f6968a = ref$ObjectRef;
        this.f6969b = e83Var;
        this.f6970c = strArr;
        this.f6971d = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        return r4;
     */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(int[] iArr, Continuation continuation) throws Throwable {
        TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 triggerBasedInvalidationTracker$createFlow$1$2$emit$1;
        int[] iArr2;
        if (continuation instanceof TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) {
            triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = (TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) continuation;
            int i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6768d;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6768d = i - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(this, continuation);
            }
        } else {
            triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(this, continuation);
        }
        Object obj = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6766b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6768d;
        Object obj2 = null;
        Ref$ObjectRef ref$ObjectRef = this.f6968a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj3 = ref$ObjectRef.f47718a;
            String[] strArr = this.f6970c;
            e83 e83Var = this.f6969b;
            if (obj3 == null) {
                Set setM20855w0 = AbstractC3550rv.m20855w0(strArr);
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6765a = iArr;
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6768d = 1;
            } else {
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj4 = ref$ObjectRef.f47718a;
                    if (obj4 == null) {
                        Object obj5 = obj2;
                        C3386nv.m17633t("Required value was null.");
                        return obj5;
                    }
                    Object obj6 = obj2;
                    int i6 = this.f6971d[i4];
                    if (((int[]) obj4)[i6] != iArr[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    obj2 = obj6;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    Set setM22627s1 = u91.m22627s1(arrayList);
                    triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6765a = iArr;
                    triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6768d = 2;
                }
                iArr2 = iArr;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iArr2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f6765a;
            AbstractC3193b.m15359b(obj);
        }
        ref$ObjectRef.f47718a = iArr2;
        return xfa.f68157a;
    }
}
