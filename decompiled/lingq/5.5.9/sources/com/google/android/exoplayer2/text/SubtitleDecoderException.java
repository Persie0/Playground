package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(ParserException parserException) {
        super(parserException);
    }

    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(String str, Throwable th2) {
        super(str, th2);
    }
}
