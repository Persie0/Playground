package com.facebook.appevents.codeless.internal;

import dm.C5207g;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PathComponent {

    /* JADX INFO: renamed from: a */
    public final String f11514a;

    /* JADX INFO: renamed from: b */
    public final int f11515b;

    /* JADX INFO: renamed from: c */
    public final int f11516c;

    /* JADX INFO: renamed from: d */
    public final String f11517d;

    /* JADX INFO: renamed from: e */
    public final String f11518e;

    /* JADX INFO: renamed from: f */
    public final String f11519f;

    /* JADX INFO: renamed from: g */
    public final String f11520g;

    /* JADX INFO: renamed from: h */
    public final int f11521h;

    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m13365d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", "DESCRIPTION", "HINT", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] matchBitmaskTypeArrValuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(matchBitmaskTypeArrValuesCustom, matchBitmaskTypeArrValuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("class_name");
        C5207g.m11110e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f11514a = string;
        this.f11515b = jSONObject.optInt("index", -1);
        this.f11516c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        C5207g.m11110e(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f11517d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        C5207g.m11110e(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f11518e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        C5207g.m11110e(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f11519f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        C5207g.m11110e(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f11520g = strOptString4;
        this.f11521h = jSONObject.optInt("match_bitmask");
    }
}
