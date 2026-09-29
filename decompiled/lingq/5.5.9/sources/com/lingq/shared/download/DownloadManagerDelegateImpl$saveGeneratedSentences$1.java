package com.lingq.shared.download;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$DoubleRef;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$saveGeneratedSentences$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {632}, m19208m = "invokeSuspend")
final class DownloadManagerDelegateImpl$saveGeneratedSentences$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17959e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DownloadManagerDelegateImpl f17960f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17961g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f17962h;

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$saveGeneratedSentences$1$a */
    public static final class C3310a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(Integer.valueOf(((SentenceDownloadItem) t10).f17985d), Integer.valueOf(((SentenceDownloadItem) t11).f17985d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadManagerDelegateImpl$saveGeneratedSentences$1(int i10, DownloadManagerDelegateImpl downloadManagerDelegateImpl, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17960f = downloadManagerDelegateImpl;
        this.f17961g = i10;
        this.f17962h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DownloadManagerDelegateImpl$saveGeneratedSentences$1(this.f17961g, this.f17960f, this.f17962h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DownloadManagerDelegateImpl$saveGeneratedSentences$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List listM13447o0;
        int i10;
        int i11;
        Iterator it;
        DownloadManagerDelegateImpl downloadManagerDelegateImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f17959e;
        int i13 = 1;
        if (i12 == 0) {
            C7499b.m14977z0(obj);
            ArrayList arrayList = new ArrayList();
            DownloadManagerDelegateImpl downloadManagerDelegateImpl2 = this.f17960f;
            LinkedHashMap linkedHashMap = downloadManagerDelegateImpl2.f17877L;
            int i14 = this.f17961g;
            List list = (List) linkedHashMap.get(new Integer(i14));
            if (list == null || (listM13447o0 = C6752c.m13447o0(list, new C3310a())) == null) {
                listM13447o0 = EmptyList.f38032a;
            }
            Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
            Iterator it2 = listM13447o0.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                double d10 = ref$DoubleRef.f38123a;
                ref$DoubleRef.f38123a = ((SentenceDownloadItem) listM13447o0.get(i15)).f17989h + d10;
                Integer num = new Integer(((SentenceDownloadItem) next).f17985d);
                int i17 = 0;
                double d11 = 1.0d;
                while (true) {
                    i10 = 2;
                    i11 = i14;
                    it = it2;
                    if (i17 >= 2) {
                        break;
                    }
                    d11 *= (double) 10;
                    i17++;
                    i14 = i11;
                    it2 = it;
                }
                Double d12 = new Double(Math.rint(d10 * d11) / d11);
                double d13 = ref$DoubleRef.f38123a;
                int i18 = 0;
                double d14 = 1.0d;
                while (true) {
                    downloadManagerDelegateImpl = downloadManagerDelegateImpl2;
                    if (i18 < i10) {
                        d14 *= (double) 10;
                        i18++;
                        downloadManagerDelegateImpl2 = downloadManagerDelegateImpl;
                        i10 = 2;
                    }
                }
                arrayList.add(new Triple(num, d12, new Double(Math.rint(d13 * d14) / d14)));
                i15 = i16;
                downloadManagerDelegateImpl2 = downloadManagerDelegateImpl;
                i14 = i11;
                it2 = it;
                i13 = 1;
            }
            this.f17959e = i13;
            if (downloadManagerDelegateImpl2.f17880c.mo9517g(i14, this.f17962h, arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
