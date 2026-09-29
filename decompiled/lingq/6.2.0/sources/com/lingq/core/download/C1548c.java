package com.lingq.core.download;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.e83;
import p000.ke2;
import p000.mj2;
import p000.mjc;
import p000.nj2;
import p000.oj2;
import p000.pj2;
import p000.rj2;
import p000.sj2;
import p000.tj2;
import p000.xfa;
import p000.yi7;

/* JADX INFO: renamed from: com.lingq.core.download.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1548c implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1549d f20223a;

    public C1548c(C1549d c1549d) {
        this.f20223a = c1549d;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r10 == r12) goto L36;
     */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ReaderFont readerFont, Continuation continuation) throws Throwable {
        FontDownloadManagerImpl$1$1$emit$1 fontDownloadManagerImpl$1$1$emit$1;
        Exception exc;
        String strM16860b;
        File file;
        C1549d c1549d = this.f20223a;
        C3244l c3244l = c1549d.f20230g;
        if (continuation instanceof FontDownloadManagerImpl$1$1$emit$1) {
            fontDownloadManagerImpl$1$1$emit$1 = (FontDownloadManagerImpl$1$1$emit$1) continuation;
            int i = fontDownloadManagerImpl$1$1$emit$1.f20214f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fontDownloadManagerImpl$1$1$emit$1.f20214f = i - Integer.MIN_VALUE;
            } else {
                fontDownloadManagerImpl$1$1$emit$1 = new FontDownloadManagerImpl$1$1$emit$1(this, continuation);
            }
        } else {
            fontDownloadManagerImpl$1$1$emit$1 = new FontDownloadManagerImpl$1$1$emit$1(this, continuation);
        }
        FontDownloadManagerImpl$1$1$emit$1 fontDownloadManagerImpl$1$1$emit$2 = fontDownloadManagerImpl$1$1$emit$1;
        Object objM8238b = fontDownloadManagerImpl$1$1$emit$2.f20212d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fontDownloadManagerImpl$1$1$emit$2.f20214f;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM8238b);
                strM16860b = mjc.m16860b(readerFont);
                File file2 = new File(c1549d.f20227d, strM16860b);
                if (!file2.exists() && !strM16860b.equals(c1549d.f20226c)) {
                    c1549d.f20226c = strM16860b;
                    yi7 yi7Var = ((C1368a) c1549d.f20224a).f18363N1;
                    fontDownloadManagerImpl$1$1$emit$2.f20209a = readerFont;
                    fontDownloadManagerImpl$1$1$emit$2.f20210b = strM16860b;
                    fontDownloadManagerImpl$1$1$emit$2.f20211c = file2;
                    fontDownloadManagerImpl$1$1$emit$2.f20214f = 1;
                    Object objM15541t = AbstractC3224d.m15541t(yi7Var, fontDownloadManagerImpl$1$1$emit$2);
                    if (objM15541t != coroutineSingletons) {
                        file = file2;
                        objM8238b = objM15541t;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            }
            if (i2 == 1) {
                File file3 = fontDownloadManagerImpl$1$1$emit$2.f20211c;
                strM16860b = fontDownloadManagerImpl$1$1$emit$2.f20210b;
                ReaderFont readerFont2 = fontDownloadManagerImpl$1$1$emit$2.f20209a;
                try {
                    AbstractC3193b.m15359b(objM8238b);
                    file = file3;
                    readerFont = readerFont2;
                } catch (Exception e) {
                    exc = e;
                    readerFont = readerFont2;
                    exc.printStackTrace();
                    sj2 sj2Var = new sj2(readerFont);
                    c3244l.getClass();
                    c3244l.m15572j(null, sj2Var);
                }
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                readerFont = fontDownloadManagerImpl$1$1$emit$2.f20209a;
                AbstractC3193b.m15359b(objM8238b);
            }
            pj2 pj2Var = (pj2) objM8238b;
            c1549d.f20226c = null;
            if (pj2Var instanceof oj2) {
                rj2 rj2Var = new rj2(readerFont);
                c3244l.getClass();
                c3244l.m15572j(null, rj2Var);
            } else if (pj2Var instanceof nj2) {
                sj2 sj2Var2 = new sj2(readerFont);
                c3244l.getClass();
                c3244l.m15572j(null, sj2Var2);
            } else {
                if (!(pj2Var instanceof mj2)) {
                    throw new NoWhenBranchMatchedException();
                }
                tj2 tj2Var = tj2.f62365a;
                c3244l.getClass();
                c3244l.m15572j(null, tj2Var);
            }
            return xfa.f68157a;
            String str = ((ServerEnvironment) objM8238b).getBaseUrl() + "static/fonts/android/" + strM16860b;
            C1550a c1550a = c1549d.f20225b;
            ke2 ke2Var = new ke2(3, c1549d, readerFont);
            fontDownloadManagerImpl$1$1$emit$2.f20209a = readerFont;
            fontDownloadManagerImpl$1$1$emit$2.f20210b = null;
            fontDownloadManagerImpl$1$1$emit$2.f20211c = null;
            fontDownloadManagerImpl$1$1$emit$2.f20214f = 2;
            objM8238b = C1550a.m8238b(c1550a, str, file, ke2Var, fontDownloadManagerImpl$1$1$emit$2, 4);
        } catch (Exception e2) {
            exc = e2;
        }
    }
}
