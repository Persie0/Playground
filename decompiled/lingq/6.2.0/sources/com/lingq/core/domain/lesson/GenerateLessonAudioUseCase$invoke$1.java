package com.lingq.core.domain.lesson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ym5;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GenerateLessonAudioUseCase", m4291f = "GenerateLessonAudioUseCase.kt", m4292l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 43, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 53, 61, 62, 64, 75, 78, 79, 84, 85, 91, 103}, m4293m = "invoke", m4294v = 2)
final class GenerateLessonAudioUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18657a;

    /* JADX INFO: renamed from: b */
    public DownloadItem f18658b;

    /* JADX INFO: renamed from: c */
    public TextToSpeechAppVoice f18659c;

    /* JADX INFO: renamed from: d */
    public ym5 f18660d;

    /* JADX INFO: renamed from: e */
    public ym5 f18661e;

    /* JADX INFO: renamed from: f */
    public String f18662f;

    /* JADX INFO: renamed from: g */
    public int f18663g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f18664h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1381c f18665i;

    /* JADX INFO: renamed from: j */
    public int f18666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLessonAudioUseCase$invoke$1(C1381c c1381c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18665i = c1381c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18664h = obj;
        this.f18666j |= Integer.MIN_VALUE;
        return this.f18665i.m7991b(0, null, this);
    }
}
