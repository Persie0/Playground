package com.lingq.core.download;

import android.content.Context;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.audio.AudioFetchErrorType;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3393o1;
import p000.C2907cy;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.cd4;
import p000.e65;
import p000.fa4;
import p000.lj2;
import p000.mb1;
import p000.ob1;
import p000.pg9;
import p000.un1;
import p000.vd7;
import p000.vz1;
import p000.wfb;
import p000.xd7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.download.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1547b implements InterfaceC3812yx {

    /* JADX INFO: renamed from: a */
    public final un1 f20217a;

    /* JADX INFO: renamed from: b */
    public final xd7 f20218b;

    /* JADX INFO: renamed from: c */
    public final C1550a f20219c;

    /* JADX INFO: renamed from: d */
    public final lj2 f20220d;

    /* JADX INFO: renamed from: e */
    public final File f20221e;

    /* JADX INFO: renamed from: f */
    public final Map f20222f;

    public C1547b(Context context, un1 un1Var, xd7 xd7Var, C1550a c1550a, lj2 lj2Var) {
        un1Var.getClass();
        xd7Var.getClass();
        c1550a.getClass();
        lj2Var.getClass();
        this.f20217a = un1Var;
        this.f20218b = xd7Var;
        this.f20219c = c1550a;
        this.f20220d = lj2Var;
        ob1.Companion.getClass();
        this.f20221e = mb1.m16743c(context);
        this.f20222f = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m8230a(C1547b c1547b, DownloadItem downloadItem, ContinuationImpl continuationImpl) throws Throwable {
        AudioDownloadManagerImpl$handleDownloadError$1 audioDownloadManagerImpl$handleDownloadError$1;
        if (continuationImpl instanceof AudioDownloadManagerImpl$handleDownloadError$1) {
            audioDownloadManagerImpl$handleDownloadError$1 = (AudioDownloadManagerImpl$handleDownloadError$1) continuationImpl;
            int i = audioDownloadManagerImpl$handleDownloadError$1.f20191d;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioDownloadManagerImpl$handleDownloadError$1.f20191d = i - Integer.MIN_VALUE;
            } else {
                audioDownloadManagerImpl$handleDownloadError$1 = new AudioDownloadManagerImpl$handleDownloadError$1(c1547b, continuationImpl);
            }
        } else {
            audioDownloadManagerImpl$handleDownloadError$1 = new AudioDownloadManagerImpl$handleDownloadError$1(c1547b, continuationImpl);
        }
        Object objM7356p = audioDownloadManagerImpl$handleDownloadError$1.f20189b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = audioDownloadManagerImpl$handleDownloadError$1.f20191d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7356p);
            if (new File(c1547b.f20221e + "/" + downloadItem.f18843b + ".mp3").exists()) {
                xd7 xd7Var = c1547b.f20218b;
                String str = downloadItem.f18842a;
                int i3 = downloadItem.f18843b;
                audioDownloadManagerImpl$handleDownloadError$1.f20188a = downloadItem;
                audioDownloadManagerImpl$handleDownloadError$1.f20191d = 2;
                objM7356p = ((C1302r) xd7Var).m7356p(i3, str, audioDownloadManagerImpl$handleDownloadError$1);
                if (objM7356p != obj) {
                }
            } else {
                AudioFetchErrorType audioFetchErrorType = AudioFetchErrorType.DownloadFailed;
                audioDownloadManagerImpl$handleDownloadError$1.f20188a = null;
                audioDownloadManagerImpl$handleDownloadError$1.f20191d = 1;
                if (c1547b.m8232b(downloadItem, "error", audioFetchErrorType, audioDownloadManagerImpl$handleDownloadError$1) != obj) {
                    return xfaVar;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM7356p);
            return xfaVar;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC3193b.m15359b(objM7356p);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        downloadItem = audioDownloadManagerImpl$handleDownloadError$1.f20188a;
        AbstractC3193b.m15359b(objM7356p);
        vd7 vd7Var = (vd7) objM7356p;
        if (vd7Var == null || !vd7Var.f65237b) {
            AudioFetchErrorType audioFetchErrorType2 = AudioFetchErrorType.DownloadFailed;
            audioDownloadManagerImpl$handleDownloadError$1.f20188a = null;
            audioDownloadManagerImpl$handleDownloadError$1.f20191d = 3;
            if (c1547b.m8232b(downloadItem, "error", audioFetchErrorType2, audioDownloadManagerImpl$handleDownloadError$1) == obj) {
                return obj;
            }
        }
        return xfaVar;
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: E0 */
    public final boolean mo8231E0(int i) {
        File file = new File(this.f20221e, AbstractC3393o1.m17732g(i, ".mp3"));
        return file.exists() && file.length() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m8232b(DownloadItem downloadItem, String str, AudioFetchErrorType audioFetchErrorType, ContinuationImpl continuationImpl) throws Throwable {
        AudioDownloadManagerImpl$finalizeDownload$1 audioDownloadManagerImpl$finalizeDownload$1;
        if (continuationImpl instanceof AudioDownloadManagerImpl$finalizeDownload$1) {
            audioDownloadManagerImpl$finalizeDownload$1 = (AudioDownloadManagerImpl$finalizeDownload$1) continuationImpl;
            int i = audioDownloadManagerImpl$finalizeDownload$1.f20187d;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioDownloadManagerImpl$finalizeDownload$1.f20187d = i - Integer.MIN_VALUE;
            } else {
                audioDownloadManagerImpl$finalizeDownload$1 = new AudioDownloadManagerImpl$finalizeDownload$1(this, continuationImpl);
            }
        } else {
            audioDownloadManagerImpl$finalizeDownload$1 = new AudioDownloadManagerImpl$finalizeDownload$1(this, continuationImpl);
        }
        AudioDownloadManagerImpl$finalizeDownload$1 audioDownloadManagerImpl$finalizeDownload$2 = audioDownloadManagerImpl$finalizeDownload$1;
        Object obj = audioDownloadManagerImpl$finalizeDownload$2.f20185b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = audioDownloadManagerImpl$finalizeDownload$2.f20187d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            String str2 = downloadItem.f18842a;
            int i3 = downloadItem.f18843b;
            int i4 = fa4.m11650l(str, "completed") ? 100 : 0;
            String strName = audioFetchErrorType != null ? audioFetchErrorType.name() : null;
            audioDownloadManagerImpl$finalizeDownload$2.f20184a = downloadItem;
            audioDownloadManagerImpl$finalizeDownload$2.f20187d = 1;
            if (((C1302r) this.f20218b).m7340A(i3, i4, str2, str, strName, audioDownloadManagerImpl$finalizeDownload$2) != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        downloadItem = audioDownloadManagerImpl$finalizeDownload$2.f20184a;
        AbstractC3193b.m15359b(obj);
        int i5 = downloadItem.f18843b;
        audioDownloadManagerImpl$finalizeDownload$2.f20184a = null;
        audioDownloadManagerImpl$finalizeDownload$2.f20187d = 2;
        this.f20220d.m16253a(i5);
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: e2 */
    public final void mo8233e2(String str, List list) {
        un1 un1Var;
        str.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            un1Var = this.f20217a;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Map map = this.f20222f;
            cd4 cd4Var = (cd4) map.get(numValueOf);
            if (cd4Var != null) {
                cd4Var.mo4537a(null);
            }
            map.remove(Integer.valueOf(iIntValue));
            wfb.m23926u(un1Var, null, null, new AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1(this, iIntValue, null), 3);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            wfb.m23926u(un1Var, null, null, new AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1(this, str, ((Number) it2.next()).intValue(), null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: r */
    public final Object mo8234r(DownloadItem downloadItem, Continuation continuation) throws Throwable {
        AudioDownloadManagerImpl$setupDownload$1 audioDownloadManagerImpl$setupDownload$1;
        File file;
        Object objM7356p;
        int i;
        int i2;
        DownloadItem downloadItem2;
        File file2;
        int i3;
        DownloadItem downloadItem3;
        int i4;
        DownloadItem downloadItem4 = downloadItem;
        if (continuation instanceof AudioDownloadManagerImpl$setupDownload$1) {
            audioDownloadManagerImpl$setupDownload$1 = (AudioDownloadManagerImpl$setupDownload$1) continuation;
            int i5 = audioDownloadManagerImpl$setupDownload$1.f20198g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                audioDownloadManagerImpl$setupDownload$1.f20198g = i5 - Integer.MIN_VALUE;
            } else {
                audioDownloadManagerImpl$setupDownload$1 = new AudioDownloadManagerImpl$setupDownload$1(this, continuation);
            }
        } else {
            audioDownloadManagerImpl$setupDownload$1 = new AudioDownloadManagerImpl$setupDownload$1(this, continuation);
        }
        AudioDownloadManagerImpl$setupDownload$1 audioDownloadManagerImpl$setupDownload$2 = audioDownloadManagerImpl$setupDownload$1;
        Object obj = audioDownloadManagerImpl$setupDownload$2.f20196e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = audioDownloadManagerImpl$setupDownload$2.f20198g;
        lj2 lj2Var = this.f20220d;
        Map map = this.f20222f;
        xd7 xd7Var = this.f20218b;
        xfa xfaVar = xfa.f68157a;
        if (i6 == 0) {
            AbstractC3193b.m15359b(obj);
            file = new File(this.f20221e, AbstractC3393o1.m17732g(downloadItem4.f18843b, ".mp3"));
            String str = downloadItem4.f18842a;
            int i7 = downloadItem4.f18843b;
            audioDownloadManagerImpl$setupDownload$2.f20192a = downloadItem4;
            audioDownloadManagerImpl$setupDownload$2.f20193b = file;
            audioDownloadManagerImpl$setupDownload$2.f20198g = 1;
            objM7356p = ((C1302r) xd7Var).m7356p(i7, str, audioDownloadManagerImpl$setupDownload$2);
            if (objM7356p != coroutineSingletons) {
            }
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                if (i6 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file2 = audioDownloadManagerImpl$setupDownload$2.f20193b;
                downloadItem2 = audioDownloadManagerImpl$setupDownload$2.f20192a;
                AbstractC3193b.m15359b(obj);
                pg9 pg9VarM23926u = wfb.m23926u(this.f20217a, null, null, new AudioDownloadManagerImpl$setupDownload$job$1(this, downloadItem2, file2, null), 3);
                map.getClass();
                map.put(new Integer(downloadItem2.f18843b), pg9VarM23926u);
            }
            i3 = audioDownloadManagerImpl$setupDownload$2.f20195d;
            i4 = audioDownloadManagerImpl$setupDownload$2.f20194c;
            downloadItem3 = audioDownloadManagerImpl$setupDownload$2.f20192a;
            AbstractC3193b.m15359b(obj);
            i = i4;
            downloadItem4 = downloadItem3;
            i2 = i3;
            int i8 = downloadItem4.f18843b;
            audioDownloadManagerImpl$setupDownload$2.f20192a = null;
            audioDownloadManagerImpl$setupDownload$2.f20193b = null;
            audioDownloadManagerImpl$setupDownload$2.f20194c = i;
            audioDownloadManagerImpl$setupDownload$2.f20195d = i2;
            audioDownloadManagerImpl$setupDownload$2.f20198g = 3;
            lj2Var.m16253a(i8);
            return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
        File file3 = audioDownloadManagerImpl$setupDownload$2.f20193b;
        DownloadItem downloadItem5 = audioDownloadManagerImpl$setupDownload$2.f20192a;
        AbstractC3193b.m15359b(obj);
        file = file3;
        downloadItem4 = downloadItem5;
        objM7356p = obj;
        vd7 vd7Var = (vd7) objM7356p;
        i = (vd7Var == null || !vd7Var.f65237b || vd7Var.f65238c < 100) ? 0 : 1;
        i2 = (!file.exists() || file.length() <= 0) ? 0 : 1;
        int i9 = downloadItem4.f18843b;
        int i10 = downloadItem4.f18843b;
        String str2 = downloadItem4.f18842a;
        cd4 cd4Var = (cd4) e65.m10872d(i9, map);
        if (cd4Var == null || !cd4Var.mo4538b()) {
            if (i2 == 0) {
                int i11 = i2;
                if (file.exists()) {
                    file.delete();
                }
                mo8233e2(str2, vz1.m23604J(new Integer(i10)));
                if (!file.exists()) {
                    audioDownloadManagerImpl$setupDownload$2.f20192a = downloadItem4;
                    audioDownloadManagerImpl$setupDownload$2.f20193b = file;
                    audioDownloadManagerImpl$setupDownload$2.f20194c = i;
                    audioDownloadManagerImpl$setupDownload$2.f20195d = i11;
                    audioDownloadManagerImpl$setupDownload$2.f20198g = 4;
                    lj2Var.m16254b(new C2907cy(i10, str2, 0));
                    if (xfaVar != coroutineSingletons) {
                        downloadItem2 = downloadItem4;
                        file2 = file;
                        pg9 pg9VarM23926u2 = wfb.m23926u(this.f20217a, null, null, new AudioDownloadManagerImpl$setupDownload$job$1(this, downloadItem2, file2, null), 3);
                        map.getClass();
                        map.put(new Integer(downloadItem2.f18843b), pg9VarM23926u2);
                    }
                }
            } else if (i == 0) {
                String str3 = downloadItem4.f18842a;
                int i12 = downloadItem4.f18843b;
                audioDownloadManagerImpl$setupDownload$2.f20192a = downloadItem4;
                audioDownloadManagerImpl$setupDownload$2.f20193b = null;
                audioDownloadManagerImpl$setupDownload$2.f20194c = i;
                audioDownloadManagerImpl$setupDownload$2.f20195d = i2;
                audioDownloadManagerImpl$setupDownload$2.f20198g = 2;
                i3 = i2;
                if (((C1302r) xd7Var).m7340A(i12, 100, str3, "completed", null, audioDownloadManagerImpl$setupDownload$2) != coroutineSingletons) {
                    downloadItem3 = downloadItem4;
                    i4 = i;
                    i = i4;
                    downloadItem4 = downloadItem3;
                    i2 = i3;
                    int i13 = downloadItem4.f18843b;
                    audioDownloadManagerImpl$setupDownload$2.f20192a = null;
                    audioDownloadManagerImpl$setupDownload$2.f20193b = null;
                    audioDownloadManagerImpl$setupDownload$2.f20194c = i;
                    audioDownloadManagerImpl$setupDownload$2.f20195d = i2;
                    audioDownloadManagerImpl$setupDownload$2.f20198g = 3;
                    lj2Var.m16253a(i13);
                    if (xfaVar == coroutineSingletons) {
                    }
                }
            } else {
                int i14 = downloadItem4.f18843b;
                audioDownloadManagerImpl$setupDownload$2.f20192a = null;
                audioDownloadManagerImpl$setupDownload$2.f20193b = null;
                audioDownloadManagerImpl$setupDownload$2.f20194c = i;
                audioDownloadManagerImpl$setupDownload$2.f20195d = i2;
                audioDownloadManagerImpl$setupDownload$2.f20198g = 3;
                lj2Var.m16253a(i14);
                if (xfaVar == coroutineSingletons) {
                }
            }
        }
    }
}
