package com.lingq.feature.imports;

import android.content.Context;
import com.lingq.core.domain.model.LanguageLearn;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import p000.a7d;
import p000.gx9;
import p000.ix9;
import p000.jx9;
import p000.ks8;
import p000.l3d;
import p000.tk4;
import p000.vz1;
import p000.x01;
import p000.yc4;

/* JADX INFO: renamed from: com.lingq.feature.imports.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2104a {

    /* JADX INFO: renamed from: a */
    public final Context f26147a;

    /* JADX INFO: renamed from: b */
    public final Map f26148b = AbstractC3194a.m15365R(new Pair(LanguageLearn.Korean.getCode(), vz1.m23605K(new ks8(this, 14), new TextRecognitionManager$pipelines$2(0, this, C2104a.class, "mlKitDefault", "mlKitDefault()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0), new TextRecognitionManager$pipelines$3(0, this, C2104a.class, "gmsVision", "gmsVision()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0))), new Pair(LanguageLearn.Japanese.getCode(), vz1.m23605K(new ks8(this, 15), new TextRecognitionManager$pipelines$5(0, this, C2104a.class, "mlKitDefault", "mlKitDefault()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0), new TextRecognitionManager$pipelines$6(0, this, C2104a.class, "gmsVision", "gmsVision()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0))), new Pair(LanguageLearn.ChineseTraditional.getCode(), vz1.m23605K(new ks8(this, 16), new TextRecognitionManager$pipelines$8(0, this, C2104a.class, "mlKitDefault", "mlKitDefault()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0), new TextRecognitionManager$pipelines$9(0, this, C2104a.class, "gmsVision", "gmsVision()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0))), new Pair(LanguageLearn.Mandarin.getCode(), vz1.m23605K(new ks8(this, 17), new TextRecognitionManager$pipelines$11(0, this, C2104a.class, "mlKitDefault", "mlKitDefault()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0), new TextRecognitionManager$pipelines$12(0, this, C2104a.class, "gmsVision", "gmsVision()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0))), new Pair("default", vz1.m23605K(new TextRecognitionManager$pipelines$13(0, this, C2104a.class, "mlKitDefault", "mlKitDefault()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0), new TextRecognitionManager$pipelines$14(0, this, C2104a.class, "gmsVision", "gmsVision()Lcom/lingq/feature/imports/TextRecognitionManager$TextRecognizerApi;", 0))));

    public C2104a(Context context) {
        this.f26147a = context;
    }

    /* JADX INFO: renamed from: a */
    public static gx9 m9002a(jx9 jx9Var) {
        l3d l3dVarM167a = ((jx9Var instanceof tk4) || (jx9Var instanceof yc4) || (jx9Var instanceof x01)) ? a7d.m167a(jx9Var) : a7d.m167a(ix9.f44745c);
        return new gx9(l3dVarM167a);
    }
}
