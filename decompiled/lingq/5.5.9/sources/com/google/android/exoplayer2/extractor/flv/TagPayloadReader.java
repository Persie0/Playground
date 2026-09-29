package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p261m9.InterfaceC7522w;

/* JADX INFO: loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7522w f12232a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(InterfaceC7522w interfaceC7522w) {
        this.f12232a = interfaceC7522w;
    }
}
