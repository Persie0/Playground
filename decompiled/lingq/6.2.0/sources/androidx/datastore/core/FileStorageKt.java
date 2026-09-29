package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorageKt {

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 */
    @c32(m4290c = "androidx.datastore.core.FileStorageKt", m4291f = "FileStorage.kt", m4292l = {224}, m4293m = "runFileDiagnosticsIfNotCorruption", m4294v = 1)
    public static final class C05091<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C05091(Continuation<? super C05091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileStorageKt.runFileDiagnosticsIfNotCorruption(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object runFileDiagnosticsIfNotCorruption(File file, vi3 vi3Var, Continuation<? super T> continuation) throws Throwable {
        C05091 c05091;
        if (continuation instanceof C05091) {
            c05091 = (C05091) continuation;
            int i = c05091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05091.label = i - Integer.MIN_VALUE;
            } else {
                c05091 = new C05091(continuation);
            }
        } else {
            c05091 = new C05091(continuation);
        }
        Object obj = c05091.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05091.label;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                c05091.L$0 = file;
                c05091.label = 1;
                Object objInvoke = vi3Var.invoke(c05091);
                return objInvoke == obj2 ? obj2 : objInvoke;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            return obj;
        } catch (IOException e) {
            if (e instanceof CorruptionException) {
                throw e;
            }
            throw FileDiagnostics.INSTANCE.attachFileDebugInfo(file, e);
        }
    }
}
