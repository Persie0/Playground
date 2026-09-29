package com.iterable.iterableapi;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1211g {

    /* JADX INFO: renamed from: a */
    public final JSONObject f14025a;

    /* JADX INFO: renamed from: b */
    public final IterableInAppMessage$Trigger$TriggerType f14026b;

    public C1211g(JSONObject jSONObject) {
        this.f14025a = jSONObject;
        String strOptString = jSONObject.optString("type");
        strOptString.getClass();
        if (strOptString.equals("never")) {
            this.f14026b = IterableInAppMessage$Trigger$TriggerType.NEVER;
        } else if (strOptString.equals("immediate")) {
            this.f14026b = IterableInAppMessage$Trigger$TriggerType.IMMEDIATE;
        } else {
            this.f14026b = IterableInAppMessage$Trigger$TriggerType.NEVER;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1211g) {
            return Objects.equals(this.f14025a, ((C1211g) obj).f14025a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14025a);
    }

    public C1211g(IterableInAppMessage$Trigger$TriggerType iterableInAppMessage$Trigger$TriggerType) {
        this.f14025a = null;
        this.f14026b = iterableInAppMessage$Trigger$TriggerType;
    }
}
