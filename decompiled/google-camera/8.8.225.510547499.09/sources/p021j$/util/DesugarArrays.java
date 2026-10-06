package p021j$.util;

import p021j$.util.stream.Stream;
import p021j$.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(AbstractC0517U.m12523m(tArr, 0, tArr.length), false);
    }
}
