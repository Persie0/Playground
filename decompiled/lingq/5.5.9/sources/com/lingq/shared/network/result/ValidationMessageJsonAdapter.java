package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ValidationMessageJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ValidationMessage;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ValidationMessageJsonAdapter extends AbstractC4949k<ValidationMessage> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19144a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<String>> f19145b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f19146c;

    public ValidationMessageJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19144a = JsonReader.C4932a.m10513a("message", "is_valid");
        C9756b.b bVarM17659d = C9312p.m17659d(List.class, String.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f19145b = c4955q.m10565c(bVarM17659d, emptySet, "message");
        this.f19146c = c4955q.m10565c(Boolean.TYPE, emptySet, "isValid");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ValidationMessage mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<String> listMo9385a = null;
        Boolean boolMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f19144a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f19145b.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("message", "message", jsonReader);
                }
            } else if (iMo10512y0 == 1 && (boolMo9385a = this.f19146c.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("isValid", "is_valid", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (listMo9385a == null) {
            throw C9756b.m18248g("message", "message", jsonReader);
        }
        if (boolMo9385a != null) {
            return new ValidationMessage(listMo9385a, boolMo9385a.booleanValue());
        }
        throw C9756b.m18248g("isValid", "is_valid", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ValidationMessage validationMessage) throws IOException {
        ValidationMessage validationMessage2 = validationMessage;
        C5207g.m11111f(abstractC9310n, "writer");
        if (validationMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("message");
        this.f19145b.mo9386f(abstractC9310n, validationMessage2.f19142a);
        abstractC9310n.mo10551C("is_valid");
        this.f19146c.mo9386f(abstractC9310n, Boolean.valueOf(validationMessage2.f19143b));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(ValidationMessage)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
