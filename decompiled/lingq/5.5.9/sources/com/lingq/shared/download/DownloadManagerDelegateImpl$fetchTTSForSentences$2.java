package com.lingq.shared.download;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$fetchTTSForSentences$2", m19206f = "DownloadManagerDelegate.kt", m19207l = {553, 558, 576}, m19208m = "invokeSuspend")
public final class DownloadManagerDelegateImpl$fetchTTSForSentences$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public int f17943H;

    /* JADX INFO: renamed from: I */
    public boolean f17944I;

    /* JADX INFO: renamed from: J */
    public int f17945J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ DownloadManagerDelegateImpl f17946K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f17947L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ String f17948M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ boolean f17949N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ List<Pair<String, Integer>> f17950O;

    /* JADX INFO: renamed from: e */
    public TextToSpeechAppVoice f17951e;

    /* JADX INFO: renamed from: f */
    public List f17952f;

    /* JADX INFO: renamed from: g */
    public DownloadManagerDelegateImpl f17953g;

    /* JADX INFO: renamed from: h */
    public String f17954h;

    /* JADX INFO: renamed from: i */
    public Iterator f17955i;

    /* JADX INFO: renamed from: j */
    public int f17956j;

    /* JADX INFO: renamed from: k */
    public int f17957k;

    /* JADX INFO: renamed from: l */
    public int f17958l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadManagerDelegateImpl$fetchTTSForSentences$2(DownloadManagerDelegateImpl downloadManagerDelegateImpl, int i10, String str, boolean z10, List<Pair<String, Integer>> list, InterfaceC9968c<? super DownloadManagerDelegateImpl$fetchTTSForSentences$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17946K = downloadManagerDelegateImpl;
        this.f17947L = i10;
        this.f17948M = str;
        this.f17949N = z10;
        this.f17950O = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DownloadManagerDelegateImpl$fetchTTSForSentences$2(this.f17946K, this.f17947L, this.f17948M, this.f17949N, this.f17950O, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DownloadManagerDelegateImpl$fetchTTSForSentences$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:29:0x0100  */
    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    /* JADX WARN: Code duplicated, block: B:34:0x013e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0143  */
    /* JADX WARN: Code duplicated, block: B:36:0x015c  */
    /* JADX WARN: Code duplicated, block: B:39:0x017c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0182  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0182 -> B:44:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.download.DownloadManagerDelegateImpl$fetchTTSForSentences$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
