package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationValidationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultRegistrationValidation;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultRegistrationValidationJsonAdapter extends AbstractC4949k<ResultRegistrationValidation> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18925a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<ValidationMessage> f18926b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ResultRegistrationValidation> f18927c;

    public ResultRegistrationValidationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18925a = JsonReader.C4932a.m10513a("email", "username");
        this.f18926b = c4955q.m10565c(ValidationMessage.class, EmptySet.f38034a, "email");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultRegistrationValidation mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        ValidationMessage validationMessageMo9385a = null;
        ValidationMessage validationMessageMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18925a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                validationMessageMo9385a = this.f18926b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                validationMessageMo9385a2 = this.f18926b.mo9385a(jsonReader);
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new ResultRegistrationValidation(validationMessageMo9385a, validationMessageMo9385a2);
        }
        Constructor<ResultRegistrationValidation> declaredConstructor = this.f18927c;
        if (declaredConstructor == null) {
            declaredConstructor = ResultRegistrationValidation.class.getDeclaredConstructor(ValidationMessage.class, ValidationMessage.class, Integer.TYPE, C9756b.f49813c);
            this.f18927c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultRegistrationValida…his.constructorRef = it }");
        }
        ResultRegistrationValidation resultRegistrationValidationNewInstance = declaredConstructor.newInstance(validationMessageMo9385a, validationMessageMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultRegistrationValidationNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultRegistrationValidationNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultRegistrationValidation resultRegistrationValidation) throws IOException {
        ResultRegistrationValidation resultRegistrationValidation2 = resultRegistrationValidation;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultRegistrationValidation2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("email");
        ValidationMessage validationMessage = resultRegistrationValidation2.f18923a;
        AbstractC4949k<ValidationMessage> abstractC4949k = this.f18926b;
        abstractC4949k.mo9386f(abstractC9310n, validationMessage);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, resultRegistrationValidation2.f18924b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(50, "GeneratedJsonAdapter(ResultRegistrationValidation)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
