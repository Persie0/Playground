package com.lingq.feature.reader.content;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.x45;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder", m4291f = "LessonContentStateHolder.kt", m4292l = {151, ModuleDescriptor.MODULE_VERSION, 201}, m4293m = "loadLesson", m4294v = 2)
final class LessonContentStateHolder$loadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f27868a;

    /* JADX INFO: renamed from: b */
    public String f27869b;

    /* JADX INFO: renamed from: c */
    public x45 f27870c;

    /* JADX INFO: renamed from: d */
    public int f27871d;

    /* JADX INFO: renamed from: e */
    public int f27872e;

    /* JADX INFO: renamed from: f */
    public boolean f27873f;

    /* JADX INFO: renamed from: g */
    public boolean f27874g;

    /* JADX INFO: renamed from: h */
    public boolean f27875h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f27876i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2260a f27877j;

    /* JADX INFO: renamed from: k */
    public int f27878k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$loadLesson$1(C2260a c2260a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27877j = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27876i = obj;
        this.f27878k |= Integer.MIN_VALUE;
        return this.f27877j.m9252e(null, null, 0, false, false, false, this);
    }
}
