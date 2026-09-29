package com.lingq.shared.network.requests;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/ReceiptJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/Receipt;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReceiptJsonAdapter extends AbstractC4949k<Receipt> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Boolean> f18018b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18019c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18020d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Long> f18021e;

    public ReceiptJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18017a = JsonReader.C4932a.m10513a("isAutoRenewing", "orderId", "packageName", "productId", "purchaseState", "purchaseTime", "purchaseToken");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18018b = c4955q.m10565c(cls, emptySet, "isAutoRenewing");
        this.f18019c = c4955q.m10565c(String.class, emptySet, "orderId");
        this.f18020d = c4955q.m10565c(Integer.TYPE, emptySet, "purchaseState");
        this.f18021e = c4955q.m10565c(Long.TYPE, emptySet, "purchaseTime");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Receipt mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Boolean boolMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        Long lMo9385a = null;
        String strMo9385a3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String strMo9385a4 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18017a);
            AbstractC4949k<String> abstractC4949k = this.f18019c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    boolMo9385a = this.f18018b.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isAutoRenewing", "isAutoRenewing", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    z10 = true;
                    break;
                case 2:
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    z11 = true;
                    break;
                case 3:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    z12 = true;
                    break;
                case 4:
                    numMo9385a = this.f18020d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("purchaseState", "purchaseState", jsonReader);
                    }
                    break;
                    break;
                case 5:
                    lMo9385a = this.f18021e.mo9385a(jsonReader);
                    if (lMo9385a == null) {
                        throw C9756b.m18254m("purchaseTime", "purchaseTime", jsonReader);
                    }
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    z13 = true;
                    break;
            }
        }
        jsonReader.mo10508q();
        Receipt receipt = new Receipt();
        receipt.f18016g = boolMo9385a != null ? boolMo9385a.booleanValue() : receipt.f18016g;
        if (z10) {
            receipt.f18010a = strMo9385a4;
        }
        if (z11) {
            receipt.f18011b = strMo9385a;
        }
        if (z12) {
            receipt.f18012c = strMo9385a2;
        }
        receipt.f18014e = numMo9385a != null ? numMo9385a.intValue() : receipt.f18014e;
        receipt.f18013d = lMo9385a != null ? lMo9385a.longValue() : receipt.f18013d;
        if (z13) {
            receipt.f18015f = strMo9385a3;
        }
        return receipt;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Receipt receipt) throws IOException {
        Receipt receipt2 = receipt;
        C5207g.m11111f(abstractC9310n, "writer");
        if (receipt2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("isAutoRenewing");
        this.f18018b.mo9386f(abstractC9310n, Boolean.valueOf(receipt2.f18016g));
        abstractC9310n.mo10551C("orderId");
        String str = receipt2.f18010a;
        AbstractC4949k<String> abstractC4949k = this.f18019c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("packageName");
        abstractC4949k.mo9386f(abstractC9310n, receipt2.f18011b);
        abstractC9310n.mo10551C("productId");
        abstractC4949k.mo9386f(abstractC9310n, receipt2.f18012c);
        abstractC9310n.mo10551C("purchaseState");
        this.f18020d.mo9386f(abstractC9310n, Integer.valueOf(receipt2.f18014e));
        abstractC9310n.mo10551C("purchaseTime");
        this.f18021e.mo9386f(abstractC9310n, Long.valueOf(receipt2.f18013d));
        abstractC9310n.mo10551C("purchaseToken");
        abstractC4949k.mo9386f(abstractC9310n, receipt2.f18015f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(29, "GeneratedJsonAdapter(Receipt)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
