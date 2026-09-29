package com.lingq.p055ui.home.vocabulary;

import android.os.Environment;
import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.ExportType;
import com.lingq.shared.uimodel.LanguageLearn;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p096ei.C5408a;
import p260m8.C7499b;
import p264mi.C7563c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$export$1", m19206f = "VocabularyViewModel.kt", m19207l = {388}, m19208m = "invokeSuspend")
final class VocabularyViewModel$export$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26276e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26277f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExportType f26278g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$export$1(VocabularyViewModel vocabularyViewModel, ExportType exportType, InterfaceC9968c<? super VocabularyViewModel$export$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26277f = vocabularyViewModel;
        this.f26278g = exportType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$export$1(this.f26277f, this.f26278g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$export$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26276e;
        ExportType exportType = this.f26278g;
        VocabularyViewModel vocabularyViewModel = this.f26277f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2025r interfaceC2025r = vocabularyViewModel.f26245e;
            String strMo498E1 = vocabularyViewModel.mo498E1();
            Iterable<C7563c> iterable = (Iterable) vocabularyViewModel.f26227N.getValue();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
            for (C7563c c7563c : iterable) {
                C0009a.m30s(c7563c != null ? c7563c.f41679a : 0, arrayList);
            }
            this.f26276e = 1;
            obj = interfaceC2025r.mo6179a(strMo498E1, arrayList, exportType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            try {
                String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString() + File.separator + "LingQ";
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                List<LanguageLearn> list = C5408a.f33824a;
                C5207g.m11111f(exportType, "<this>");
                int i11 = C5408a.a.f33827c[exportType.ordinal()];
                if (i11 == 1) {
                    str = "lingq.csv";
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "lingq.apkg";
                }
                File file2 = new File(str2 + "/" + str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write(bArr);
                    C9072e c9072e = C9072e.f47360a;
                    C5206f.m11032z0(fileOutputStream, null);
                    vocabularyViewModel.f26244d0.mo14371k(file2);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                vocabularyViewModel.f26241b0.mo14371k(InterfaceC4029a.a.f26330a);
            }
        }
        return C9072e.f47360a;
    }
}
