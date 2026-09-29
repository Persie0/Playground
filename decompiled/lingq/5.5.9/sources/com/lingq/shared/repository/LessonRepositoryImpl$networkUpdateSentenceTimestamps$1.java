package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1277}, m19208m = "networkUpdateSentenceTimestamps")
public final class LessonRepositoryImpl$networkUpdateSentenceTimestamps$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19924d;

    /* JADX INFO: renamed from: e */
    public String f19925e;

    /* JADX INFO: renamed from: f */
    public Collection f19926f;

    /* JADX INFO: renamed from: g */
    public Iterator f19927g;

    /* JADX INFO: renamed from: h */
    public Collection f19928h;

    /* JADX INFO: renamed from: i */
    public int f19929i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19930j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LessonRepositoryImpl f19931k;

    /* JADX INFO: renamed from: l */
    public int f19932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkUpdateSentenceTimestamps$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkUpdateSentenceTimestamps$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19931k = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19930j = obj;
        this.f19932l |= Integer.MIN_VALUE;
        return this.f19931k.m9518g0(0, null, null, this);
    }
}
