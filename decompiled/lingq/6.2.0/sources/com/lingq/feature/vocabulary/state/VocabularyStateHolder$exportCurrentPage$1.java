package com.lingq.feature.vocabulary.state;

import android.os.Environment;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.ExportType;
import com.lingq.feature.vocabulary.domain.C2825a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.e0b;
import p000.gca;
import p000.h0a;
import p000.mxa;
import p000.sm5;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$exportCurrentPage$1", m4291f = "VocabularyStateHolder.kt", m4292l = {407}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$exportCurrentPage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExportType f33749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$exportCurrentPage$1(C2862d c2862d, ExportType exportType, Continuation continuation) {
        super(2, continuation);
        this.f33748b = c2862d;
        this.f33749c = exportType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyStateHolder$exportCurrentPage$1(this.f33748b, this.f33749c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyStateHolder$exportCurrentPage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33747a;
        ExportType exportType = this.f33749c;
        C2862d c2862d = this.f33748b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2825a c2825a = c2862d.f33800f;
            String str = c2862d.f33810p;
            List list = c2862d.f33811q;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((mxa) it.next()).f52003a, arrayList);
            }
            this.f33747a = 1;
            obj = ((C1308x) c2825a.f33568a).m7410d(str, arrayList, exportType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        byte[] bArr = (byte[]) obj;
        xfa xfaVar = xfa.f68157a;
        if (bArr == null) {
            c2862d.m9773f(new e0b(7));
            return xfaVar;
        }
        try {
            File externalFilesDir = c2862d.f33805k.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
            if (externalFilesDir == null) {
                externalFilesDir = c2862d.f33805k.getCacheDir();
            }
            File file = new File(externalFilesDir, "LingQ");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, AbstractC3184kh.m15218l(exportType));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                c2862d.m9773f(new gca(file2, 9));
                return xfaVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11432c(e2);
            c2862d.m9773f(new e0b(8));
            return xfaVar;
        }
    }
}
