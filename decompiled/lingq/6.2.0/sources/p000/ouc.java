package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.network.api.result.ResultTokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ouc {

    /* JADX INFO: renamed from: a */
    public static final int[] f55020a = {1, 10, 100, DescriptorProtos.Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: a */
    public static final TokenMeaning m18521a(ResultTokenMeaning resultTokenMeaning) {
        resultTokenMeaning.getClass();
        return new TokenMeaning(resultTokenMeaning.f21587a, resultTokenMeaning.f21588b, resultTokenMeaning.f21589c, resultTokenMeaning.f21590d, resultTokenMeaning.f21591e, resultTokenMeaning.f21592f, resultTokenMeaning.f21593g, resultTokenMeaning.f21594h, resultTokenMeaning.f21595i, resultTokenMeaning.f21596j);
    }
}
