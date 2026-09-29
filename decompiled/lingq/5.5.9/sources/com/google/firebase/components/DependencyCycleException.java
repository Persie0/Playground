package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p118fe.C5511c;

/* JADX INFO: loaded from: classes.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: a */
    public final List<C5511c<?>> f16186a;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f16186a = arrayList;
    }
}
