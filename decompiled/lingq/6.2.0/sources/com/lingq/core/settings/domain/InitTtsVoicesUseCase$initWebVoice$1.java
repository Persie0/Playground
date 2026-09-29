package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.InitTtsVoicesUseCase", m4291f = "InitTtsVoicesUseCase.kt", m4292l = {21, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 42, 43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m4293m = "initWebVoice", m4294v = 2)
final class InitTtsVoicesUseCase$initWebVoice$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22767a;

    /* JADX INFO: renamed from: b */
    public Map f22768b;

    /* JADX INFO: renamed from: c */
    public TextToSpeechVoice f22769c;

    /* JADX INFO: renamed from: d */
    public int f22770d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22771e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1863b f22772f;

    /* JADX INFO: renamed from: g */
    public int f22773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitTtsVoicesUseCase$initWebVoice$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22772f = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22771e = obj;
        this.f22773g |= Integer.MIN_VALUE;
        return this.f22772f.m8620c(null, this);
    }
}
