package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.WordRepositoryImpl", m19206f = "WordRepository.kt", m19207l = {217, 236}, m19208m = "updateWordsMoveAllKnown")
final class WordRepositoryImpl$updateWordsMoveAllKnown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f20706H;

    /* JADX INFO: renamed from: I */
    public int f20707I;

    /* JADX INFO: renamed from: J */
    public int f20708J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ Object f20709K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ WordRepositoryImpl f20710L;

    /* JADX INFO: renamed from: M */
    public int f20711M;

    /* JADX INFO: renamed from: d */
    public WordRepositoryImpl f20712d;

    /* JADX INFO: renamed from: e */
    public String f20713e;

    /* JADX INFO: renamed from: f */
    public List f20714f;

    /* JADX INFO: renamed from: g */
    public List f20715g;

    /* JADX INFO: renamed from: h */
    public List f20716h;

    /* JADX INFO: renamed from: i */
    public List f20717i;

    /* JADX INFO: renamed from: j */
    public Locale f20718j;

    /* JADX INFO: renamed from: k */
    public Iterator f20719k;

    /* JADX INFO: renamed from: l */
    public String f20720l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordRepositoryImpl$updateWordsMoveAllKnown$1(WordRepositoryImpl wordRepositoryImpl, InterfaceC9968c<? super WordRepositoryImpl$updateWordsMoveAllKnown$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20710L = wordRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20709K = obj;
        this.f20711M |= Integer.MIN_VALUE;
        return this.f20710L.mo6198h(0, null, null, this);
    }
}
