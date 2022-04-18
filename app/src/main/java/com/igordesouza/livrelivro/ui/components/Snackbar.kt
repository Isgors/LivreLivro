/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.igordesouza.livrelivro.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.igordesouza.livrelivro.ui.spacing

/**
 * An alternative to [androidx.compose.material.Snackbar] utilizing
 * [com.example.jetsnack.ui.theme.JetsnackColors]
 */
@Composable
fun LivreLivroSnackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    actionOnNewLine: Boolean = false,
    shape: Shape = RoundedCornerShape(MaterialTheme.spacing.small),
    contentColor: Color = androidx.compose.material3.MaterialTheme.colorScheme.onPrimary,
    actionColor: Color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
) {
    Snackbar(
        snackbarData = snackbarData,
        modifier = modifier,
        actionOnNewLine = actionOnNewLine,
        shape = shape,
        contentColor = contentColor,
        actionColor = actionColor)
}
