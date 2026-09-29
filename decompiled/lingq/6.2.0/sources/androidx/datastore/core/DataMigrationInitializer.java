package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.lda;
import p000.vi3;
import p000.xfa;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006e  */
        /* JADX WARN: Code duplicated, block: B:37:0x0097  */
        /* JADX WARN: Code duplicated, block: B:39:0x009a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0080 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0068->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0085 -> B:25:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0088 -> B:25:0x0068). Please report as a decompilation issue!!! */
        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, Continuation<? super xfa> continuation) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Iterator<T> it;
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            vi3 vi3Var;
            if (continuation instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuation;
                int i = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                ArrayList arrayList = new ArrayList();
                DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != coroutineSingletons) {
                    list2 = arrayList;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                } catch (Throwable th2) {
                    Object obj2 = ref$ObjectRef.f47718a;
                    if (obj2 == null) {
                        ref$ObjectRef.f47718a = th2;
                    } else {
                        obj2.getClass();
                        lda.m16117c((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                vi3Var = (vi3) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = ref$ObjectRef;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (vi3Var.invoke(dataMigrationInitializer$Companion$runMigrations$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            th = (Throwable) ref$ObjectRef.f47718a;
            if (th == null) {
                return xfa.f68157a;
            }
            throw th;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            it = list2.iterator();
            ref$ObjectRef = ref$ObjectRef2;
            while (it.hasNext()) {
                vi3Var = (vi3) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = ref$ObjectRef;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (vi3Var.invoke(dataMigrationInitializer$Companion$runMigrations$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            th = (Throwable) ref$ObjectRef.f47718a;
            if (th == null) {
                return xfa.f68157a;
            }
            throw th;
        }

        public final <T> zi3 getInitializer(List<? extends DataMigration<T>> list) {
            list.getClass();
            return new DataMigrationInitializer$Companion$getInitializer$1(list, null);
        }

        private Companion() {
        }
    }
}
