package com.lingq.core.download;

import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.mj2;
import p000.nj2;
import p000.oj2;
import p000.pj2;
import p000.un1;
import p000.vi3;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl$setupDownload$job$1", m4291f = "AudioDownloadManager.kt", m4292l = {84, 99, 102, 105}, m4293m = "invokeSuspend", m4294v = 2)
final class AudioDownloadManagerImpl$setupDownload$job$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1547b f20200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DownloadItem f20201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f20202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$setupDownload$job$1(C1547b c1547b, DownloadItem downloadItem, File file, Continuation continuation) {
        super(2, continuation);
        this.f20200b = c1547b;
        this.f20201c = downloadItem;
        this.f20202d = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioDownloadManagerImpl$setupDownload$job$1(this.f20200b, this.f20201c, this.f20202d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioDownloadManagerImpl$setupDownload$job$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r12.m8232b(r11, "completed", null, r13) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (com.lingq.core.download.C1547b.m8230a(r12, r11, r13) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r12.m8232b(r11, "idle", null, r13) == r6) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8239a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20199a;
        final DownloadItem downloadItem = this.f20201c;
        final C1547b c1547b = this.f20200b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1550a c1550a = c1547b.f20219c;
            String string = vk9.m23376L0(downloadItem.f18844c).toString();
            vi3 vi3Var = new vi3() { // from class: com.lingq.core.download.a
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    C1547b c1547b2 = c1547b;
                    wfb.m23926u(c1547b2.f20217a, null, null, new AudioDownloadManagerImpl$setupDownload$job$1$result$1$1(c1547b2, downloadItem, iIntValue, null), 3);
                    return xfa.f68157a;
                }
            };
            this.f20199a = 1;
            objM8239a = c1550a.m8239a(string, this.f20202d, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36", vi3Var, this);
            if (objM8239a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM8239a = obj;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        pj2 pj2Var = (pj2) objM8239a;
        c1547b.f20222f.remove(new Integer(downloadItem.f18843b));
        if (pj2Var instanceof oj2) {
            this.f20199a = 2;
        } else if (pj2Var instanceof nj2) {
            this.f20199a = 3;
        } else {
            if (!(pj2Var instanceof mj2)) {
                gm5.m12750e();
                return null;
            }
            this.f20199a = 4;
        }
    }
}
