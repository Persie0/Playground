package androidx.datastore.core;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.InterfaceC7198b;
import p129g3.InterfaceC5689f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InterfaceC5689f<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7198b f5711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$BooleanRef f5712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef<T> f5713c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SingleProcessDataStore<T> f5714d;

    public SingleProcessDataStore$readAndInit$api$1(InterfaceC7198b interfaceC7198b, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f5711a = interfaceC7198b;
        this.f5712b = ref$BooleanRef;
        this.f5713c = ref$ObjectRef;
        this.f5714d = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #1 {all -> 0x0070, blocks: (B:25:0x006c, B:41:0x00dd, B:43:0x00e7), top: B:64:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p129g3.InterfaceC5689f
    /* JADX INFO: renamed from: b */
    public final Object mo3015b(InterfaceC2056p<? super T, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        InterfaceC7198b interfaceC7198b;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef<T> ref$ObjectRef;
        InterfaceC2056p<? super T, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p2;
        SingleProcessDataStore singleProcessDataStore;
        InterfaceC7198b interfaceC7198b2;
        SingleProcessDataStore singleProcessDataStore2;
        InterfaceC7198b interfaceC7198b3;
        T t10;
        Ref$ObjectRef<T> ref$ObjectRef2;
        if (interfaceC9968c instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, interfaceC9968c);
        }
        Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.f5720i;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d = interfaceC2056p;
                interfaceC7198b = this.f5711a;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e = interfaceC7198b;
                Ref$BooleanRef ref$BooleanRef2 = this.f5712b;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f = ref$BooleanRef2;
                Ref$ObjectRef<T> ref$ObjectRef3 = this.f5713c;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5718g = ref$ObjectRef3;
                SingleProcessDataStore singleProcessDataStore3 = this.f5714d;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5719h = singleProcessDataStore3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k = 1;
                if (interfaceC7198b.mo14510a(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj2) {
                    return obj2;
                }
                ref$BooleanRef = ref$BooleanRef2;
                ref$ObjectRef = ref$ObjectRef3;
                interfaceC2056p2 = interfaceC2056p;
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t10 = (T) singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f;
                        ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e;
                        interfaceC7198b3 = (InterfaceC7198b) singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d;
                        try {
                            C7499b.m14977z0(obj);
                            ref$ObjectRef2.f38127a = t10;
                            ref$ObjectRef = ref$ObjectRef2;
                            T t11 = ref$ObjectRef.f38127a;
                            interfaceC7198b3.mo14511b(null);
                            return t11;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC7198b = interfaceC7198b3;
                            interfaceC7198b.mo14511b(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f;
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e;
                    interfaceC7198b2 = (InterfaceC7198b) singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d;
                    try {
                        C7499b.m14977z0(obj);
                        singleProcessDataStore2 = singleProcessDataStore4;
                        if (C5207g.m11106a(obj, ref$ObjectRef.f38127a)) {
                            interfaceC7198b3 = interfaceC7198b2;
                        } else {
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d = interfaceC7198b2;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k = 3;
                            if (singleProcessDataStore2.m3014k(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj2) {
                                return obj2;
                            }
                            t10 = (T) obj;
                            ref$ObjectRef2 = ref$ObjectRef;
                            interfaceC7198b3 = interfaceC7198b2;
                            ref$ObjectRef2.f38127a = t10;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                        T t12 = ref$ObjectRef.f38127a;
                        interfaceC7198b3.mo14511b(null);
                        return t12;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC7198b = interfaceC7198b2;
                        interfaceC7198b.mo14511b(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore5 = singleProcessDataStore$readAndInit$api$1$updateData$1.f5719h;
                ref$ObjectRef = singleProcessDataStore$readAndInit$api$1$updateData$1.f5718g;
                ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f;
                InterfaceC7198b interfaceC7198b4 = (InterfaceC7198b) singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e;
                interfaceC2056p2 = (InterfaceC2056p) singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d;
                C7499b.m14977z0(obj);
                interfaceC7198b = interfaceC7198b4;
                singleProcessDataStore = singleProcessDataStore5;
            }
            if (ref$BooleanRef.f38122a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t13 = ref$ObjectRef.f38127a;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d = interfaceC7198b;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e = ref$ObjectRef;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f = singleProcessDataStore;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5718g = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5719h = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k = 2;
            Object objMo1337m0 = interfaceC2056p2.mo1337m0(t13, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objMo1337m0 == obj2) {
                return obj2;
            }
            interfaceC7198b2 = interfaceC7198b;
            obj = objMo1337m0;
            singleProcessDataStore2 = singleProcessDataStore;
            if (C5207g.m11106a(obj, ref$ObjectRef.f38127a)) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5715d = interfaceC7198b2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5716e = ref$ObjectRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5717f = obj;
                singleProcessDataStore$readAndInit$api$1$updateData$1.f5722k = 3;
                if (singleProcessDataStore2.m3014k(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj2) {
                    return obj2;
                }
                t10 = (T) obj;
                ref$ObjectRef2 = ref$ObjectRef;
                interfaceC7198b3 = interfaceC7198b2;
                ref$ObjectRef2.f38127a = t10;
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                interfaceC7198b3 = interfaceC7198b2;
            }
            T t14 = ref$ObjectRef.f38127a;
            interfaceC7198b3.mo14511b(null);
            return t14;
        } catch (Throwable th4) {
            th = th4;
            interfaceC7198b.mo14511b(null);
            throw th;
        }
    }
}
